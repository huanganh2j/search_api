package com.bitell.server.searchapi;

import com.bitell.model.search.articles.request.ArticlesQueryByIdRequest;
import com.bitell.model.search.articles.request.ArticlesQueryListRequest;
import com.bitell.model.search.articles.response.ArticlesQueryByIdResponse;
import com.bitell.model.search.articles.response.ArticlesQueryListResponse;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
