package com.bitell.controller;

import com.bitell.base.ApiError;
import com.bitell.entity.articles.request.ArticlesQueryListRequest;
import com.bitell.entity.articles.response.ArticlesQueryListResponse;
import com.bitell.service.articles.ArticlesService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/
@Api(value = "ArticlesController", description = "文章查询相关接口")
@RestController
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    ArticlesService articlesService;

    /**
     * 最新文章查询
    * Author:an.huang
    * Descriptions:
    * Date:2018/3/27
    */
    @ResponseBody
    @ApiOperation(value = "最新文章查询", notes = "最新文章查询接口", httpMethod = "POST", response = ArticlesQueryListResponse.class)
    @RequestMapping(value = "/latestArticles")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.QUERY_FAILD, message = ApiError.QUERY_FAILD_MESSAGE)
            }
    )
    public ArticlesQueryListResponse queryByPage(@RequestBody @ApiParam(name = "文章相关信息", value = "传入json格式 ", required = true) ArticlesQueryListRequest articlesQueryListRequest, HttpServletRequest request, HttpServletResponse response) {
            ArticlesQueryListResponse articlesQueryListResponse = articlesService.queryByPage(articlesQueryListRequest);
            return articlesQueryListResponse;
    }
}
