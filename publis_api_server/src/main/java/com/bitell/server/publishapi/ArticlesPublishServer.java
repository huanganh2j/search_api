package com.bitell.server.publishapi;

import com.bitell.model.publish.article.request.ArticlePublishRequest;
import com.bitell.model.publish.article.request.ArticleRelatedPublishRequest;
import com.bitell.model.publish.article.response.ArticlePublishResponse;
import com.bitell.model.publish.article.response.ArticleRelatedPublishResponse;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*  @author an.huang 
* @date 2018/4/1 6:50 
*/
@RestController
@RequestMapping("/articles")
public interface ArticlesPublishServer {
    /**
     * 文章发布
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     */
    @ResponseBody
    @RequestMapping(value = "/articlePublish")
    public ArticlePublishResponse articlePublish(@RequestBody ArticlePublishRequest articlePublishRequest);

    /**
     * 文章联合发布
     * @param:
     * @return
     * @author an.huang
     * @date 2018/3/30 20:58
     */
    @ResponseBody
    @RequestMapping(value = "/articleRelatedPublish")
    public ArticleRelatedPublishResponse articleRelatedPublish(@RequestBody ArticleRelatedPublishRequest articleRelatedPublishRequest);
}

