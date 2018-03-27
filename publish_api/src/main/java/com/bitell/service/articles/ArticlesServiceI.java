package com.bitell.service.articles;

import com.bitell.entity.article.request.ArticlePublishRequest;
import com.bitell.entity.article.response.ArticlePublishResponse;

/**
*
* Author:an.huang
* Date:2018/3/26
*/
public interface ArticlesServiceI {
    /**
     * 文章发布
    * Author:an.huang
    * Descriptions:
    * Date:2018/3/27
    */
    public ArticlePublishResponse articlePublish(ArticlePublishRequest articlePublishRequest) throws Exception;
}
