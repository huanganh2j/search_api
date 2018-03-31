package com.bitell.entity.article.response;

import com.bitell.base.ApiResponse;
import io.swagger.annotations.ApiModelProperty;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlePublishResponse extends ApiResponse {
    @ApiModelProperty(value = "文章id")
    private Long id;
    public ArticlePublishResponse() {
    }

    public ArticlePublishResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public ArticlePublishResponse(Long id) {
        this.id = id;
    }

    public ArticlePublishResponse(int errCode, String errMsg, Long id) {
        super(errCode, errMsg);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
