package com.ywxk.bitell.model.publish.subjects.request;

import com.ywxk.bitell.model.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang
* @date 2018/3/26 21:06
*/
public class SubjectsDeleteRequest extends ApiRequest{
    @ApiModelProperty(value = "主题id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
