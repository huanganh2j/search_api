package com.bitell.entity.articles.request;

import com.bitell.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlesQueryByIdRequest extends ApiRequest{
    @ApiModelProperty(value = "文章id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
