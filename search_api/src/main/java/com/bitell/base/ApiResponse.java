/**
 * 
 */
package com.bitell.base;


import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * @author wangsheng
 *
 */
public class ApiResponse {

	/**
	 * 错误代码，0表示没有错误
	 */
	@ApiModelProperty(value = "错误代码")
	private int errCode;	
	
	/**
	 * 错误信息，没有错误时为OK
	 */
	@ApiModelProperty(value = "错误信息")
	private String errMsg;

	public ApiResponse() {
        super();
    }

    public ApiResponse(int errCode, String errMsg) {
        super();
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return "ApiResponse [errCode=" + errCode + ", errMsg=" + errMsg + "]";
	}
	
	public static boolean checkApiResponse(ApiResponse response){
		if(response == null){
			return false;
		}else{
			return response.getErrCode() == ApiError.OK;
		}
	}
	
	public static ApiResponse createErrorResponse(int errCode, String errMsg) {
		return new ApiResponse(errCode, errMsg);
	}

	public static Map<String, Object> createErrorResponseMap(int errCode, String errMsg){
        Map<String, Object> map = new HashedMap();
        map.put("errCode", errCode);
        map.put("errMsg", errMsg);
        return map;
    }

    public static Map<String, Object> createErrorResponseMap(int errCode, String errMsg, String key, Object value){
        Map<String, Object> map = new HashedMap();
        map.put("errCode", errCode);
        map.put("errMsg", errMsg);
        map.put(key, value);
        return map;
    }

    public static ApiResponse ok(){
        return new ApiResponse(ApiError.OK,"ok");
    }
}
