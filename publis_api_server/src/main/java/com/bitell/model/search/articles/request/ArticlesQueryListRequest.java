package com.bitell.model.search.articles.request;

import com.bitell.model.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlesQueryListRequest extends ApiRequest{
    @ApiModelProperty(value = "分页参数，每页数据量")
    private Integer pageSize;
    @ApiModelProperty(value = "分页参数，当前页码")
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
