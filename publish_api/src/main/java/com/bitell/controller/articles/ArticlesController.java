package com.bitell.controller.articles;

import com.bitell.base.ApiError;
import com.bitell.entity.article.request.ArticlePublishRequest;
import com.bitell.entity.article.request.ArticleRelatedPublishRequest;
import com.bitell.entity.article.response.ArticlePublishResponse;
import com.bitell.entity.article.response.ArticleRelatedPublishResponse;
import com.bitell.entity.subjects.request.SubjectsAddRequest;
import com.bitell.entity.subjects.response.SubjectsAddResponse;
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
@Api(value = "ArticlesController", description = "文章发布接口")
@RestController
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    ArticlesService articlesService;

    /**
     * 文章发布
    * Author:an.huang
    * Descriptions:
    * Date:2018/3/27
    */
    @ResponseBody
    @ApiOperation(value = "文章发布", notes = "文章发布接口", httpMethod = "POST", response = ArticlePublishResponse.class)
    @RequestMapping(value = "/articlePublish")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.SUBJECTIDS_IS_NULL, message = ApiError.SUBJECTIDS_IS_NULL_MESSAGE),
                    @ApiResponse(code = ApiError.ADD_FAILD, message = ApiError.ADD_FAILD_MESSAGE)
            }
    )
    public ArticlePublishResponse articlePublish(@RequestBody @ApiParam(name = "文章相关信息", value = "传入json格式 ", required = true) ArticlePublishRequest articlePublishRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            ArticlePublishResponse articlePublishResponse = articlesService.articlePublish(articlePublishRequest);
            return articlePublishResponse;
        } catch (Exception e) {
            return new ArticlePublishResponse(ApiError.ADD_FAILD, ApiError.ADD_FAILD_MESSAGE);
        }
    }


    /**
     * 文章联合发布
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/30 20:58
    */
    @ResponseBody
    @ApiOperation(value = "文章联合发布", notes = "文章联合发布接口", httpMethod = "POST", response = ArticleRelatedPublishResponse.class)
    @RequestMapping(value = "/articleRelatedPublish")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.SUBJECTIDS_IS_NULL, message = ApiError.SUBJECTIDS_IS_NULL_MESSAGE),
                    @ApiResponse(code = ApiError.PARAM_ERROR, message = ApiError.PARAM_ERROR_MESSAGE),
                    @ApiResponse(code = ApiError.ADD_FAILD, message = ApiError.ADD_FAILD_MESSAGE)
            }
    )
    public ArticleRelatedPublishResponse articleRelatedPublish(@RequestBody @ApiParam(name = "文章相关信息", value = "传入json格式 ", required = true) ArticleRelatedPublishRequest articleRelatedPublishRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            ArticleRelatedPublishResponse articleRelatedPublishResponse = articlesService.articleRelatedPublish(articleRelatedPublishRequest);
            return articleRelatedPublishResponse;
        } catch (Exception e) {
            return new ArticleRelatedPublishResponse(ApiError.ADD_FAILD, ApiError.ADD_FAILD_MESSAGE);
        }
    }

}
