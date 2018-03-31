/**
 *
 */
package com.bitell.base;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
* Company:bitell
* Author:an.huang
* Date:2018/1/25
*/
public class ApiRequest {

//    /**
//     * 签名字符串
//     */
////    @ApiModelProperty(value = "签名")
//    private String sign;

    /**
     * 时间戳
     */
    @ApiModelProperty(value = "时间戳")
    private long timestamp;


    /**
     * 客户端版本
     */
    @ApiModelProperty(value = "客户端版本")
    private String version;

    /**
     * 操作系统
     */
    @ApiModelProperty(value = "操作系统 (1 ios  ;2 android)",notes = "1 ios  ;2 android",required = true)
    private Integer operation;

   /**
   * Author:an.huang
   * Descriptions: 操作系统版本
   * Date:2018/2/26
   */
    @ApiModelProperty(value = "系统版本")
    private String sysVersion;

//    public String getSign() {
//        return sign;
//    }
//
//    public void setSign(String sign) {
//        this.sign = sign;
//    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

//    public boolean checkVersion(Integer minVersion) {
//        try {
//            String currentVersion = this.version.replaceAll("\\.", "");
//            if (currentVersion.length() > 3) {
//                currentVersion = currentVersion.substring(0, 3);
//            }
//            Integer tempVersion = Integer.parseInt(currentVersion);
//            if (tempVersion >= minVersion) {
//                return true;
//            }
//        } catch (Exception e) {
//            GjpLogger.error(e.getMessage());
//        }
//        return false;
//    }

//    public static boolean verify(ApiRequest request) {
//        return Md5Encrypt.verify("timestamp=" + request.getTimestamp(), request.getSign());
//    }


    public String getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }
}
