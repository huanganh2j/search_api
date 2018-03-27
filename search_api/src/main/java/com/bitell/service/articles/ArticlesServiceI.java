package com.bitell.service.articles;

import com.bitell.entity.articles.request.ArticlesQueryByIdRequest;
import com.bitell.entity.articles.request.ArticlesQueryListRequest;
import com.bitell.entity.articles.response.ArticlesQueryByIdResponse;
import com.bitell.entity.articles.response.ArticlesQueryListResponse;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/
public interface ArticlesServiceI {
    /**
     * 分页查询最新文章
    * Author:an.huang
    * Descriptions:
    * Date:2018/3/27
    */
    public ArticlesQueryListResponse queryByPage(ArticlesQueryListRequest articlesQueryListRequest);

    /**
     * 根据id查询文章内容
    * Author:an.huang
    * Descriptions:
    * Date:2018/3/27
    */
    public ArticlesQueryByIdResponse queryById(ArticlesQueryByIdRequest articlesQueryByIdRequest);
}
