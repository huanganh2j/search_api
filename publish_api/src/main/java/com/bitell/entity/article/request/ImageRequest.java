package com.bitell.entity.article.request;

import com.bitell.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/

public class ImageRequest extends ApiRequest{
    @ApiModelProperty(value = "图片地址")
    private String cover_img_url;
    @ApiModelProperty(value = "图片顺序号")
    private Integer sortIndex;

    public String getCover_img_url() {
        return cover_img_url;
    }

    public void setCover_img_url(String cover_img_url) {
        this.cover_img_url = cover_img_url;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
