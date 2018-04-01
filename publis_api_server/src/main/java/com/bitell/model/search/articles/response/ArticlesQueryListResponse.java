package com.bitell.model.search.articles.response;

import com.bitell.model.base.ApiResponse;
import com.bitell.model.search.articles.vo.ArticlesQueryVo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlesQueryListResponse extends ApiResponse {
    @ApiModelProperty(value = "数据集")
    private List<ArticlesQueryVo> vos;
    @ApiModelProperty(value = "总数量")
    private Long totalCount;
    @ApiModelProperty(value = "总页数")
    private Integer totalPage;
    @ApiModelProperty(value = "当前页码")
    private Integer currentPage;
    @ApiModelProperty(value = "每页数据量")
    private Integer pageSize;

    public List<ArticlesQueryVo> getVos() {
        return vos;
    }

    public void setVos(List<ArticlesQueryVo> vos) {
        this.vos = vos;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ArticlesQueryListResponse() {
    }

    public ArticlesQueryListResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
