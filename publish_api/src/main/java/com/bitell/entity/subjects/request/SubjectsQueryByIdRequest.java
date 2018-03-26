package com.bitell.entity.subjects.request;

import com.bitell.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang
* @date 2018/3/26 19:31
*/
public class SubjectsQueryByIdRequest extends ApiRequest{
    @ApiModelProperty(value = "主题id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
