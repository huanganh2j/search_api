package com.bitell.model.publish.subjects.response;

import com.bitell.model.base.ApiResponse;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang
* @date 2018/3/26 19:24
*/
public class SubjectsAddResponse extends ApiResponse{
    @ApiModelProperty(value = "主题id")
    private Integer id;

    public SubjectsAddResponse() {
    }

    public SubjectsAddResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public SubjectsAddResponse(Integer id) {
        this.id = id;
    }

    public SubjectsAddResponse(int errCode, String errMsg, Integer id) {
        super(errCode, errMsg);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
