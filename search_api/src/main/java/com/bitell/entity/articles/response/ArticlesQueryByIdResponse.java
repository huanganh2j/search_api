package com.bitell.entity.articles.response;

import com.bitell.base.ApiResponse;
import com.bitell.entity.articles.vo.ArticlesQueryVo;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlesQueryByIdResponse extends ApiResponse{
    private ArticlesQueryVo vo;

    public ArticlesQueryByIdResponse() {
    }

    public ArticlesQueryByIdResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public ArticlesQueryByIdResponse(ArticlesQueryVo vo) {
        this.vo = vo;
    }

    public ArticlesQueryByIdResponse(int errCode, String errMsg, ArticlesQueryVo vo) {
        super(errCode, errMsg);
        this.vo = vo;
    }

    public ArticlesQueryVo getVo() {
        return vo;
    }

    public void setVo(ArticlesQueryVo vo) {
        this.vo = vo;
    }
}
