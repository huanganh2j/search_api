package com.ywxk.bitell.server.searchapi;

import com.ywxk.bitell.model.search.articles.request.ArticlesQueryByIdRequest;
import com.ywxk.bitell.model.search.articles.request.ArticlesQueryListRequest;
import com.ywxk.bitell.model.search.articles.response.ArticlesQueryByIdResponse;
import com.ywxk.bitell.model.search.articles.response.ArticlesQueryListResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
*  @author an.huang 
* @date 2018/4/1 7:12
*/
@RestController
@RequestMapping("/articles")
public interface ArticlesSearchServer {

    /**
     * 最新文章查询
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     */
    @ResponseBody
    @RequestMapping(value = "/latestArticles")
    public ArticlesQueryListResponse queryByPage(@RequestBody ArticlesQueryListRequest articlesQueryListRequest) ;

    /**
     * 根据id查询文章内容
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     */
    @ResponseBody
    @RequestMapping(value = "/queryById")
    public ArticlesQueryByIdResponse queryById(@RequestBody  ArticlesQueryByIdRequest articlesQueryByIdRequest);
}
