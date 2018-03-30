package com.bitell.service.articles;

import com.bitell.entity.article.request.ArticlePublishRequest;
import com.bitell.entity.article.request.ArticleRelatedPublishRequest;
import com.bitell.entity.article.response.ArticlePublishResponse;
import com.bitell.entity.article.response.ArticleRelatedPublishResponse;

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

    /**
     * 文章联合发布
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/30 20:40
    */
    public ArticleRelatedPublishResponse articleRelatedPublish(ArticleRelatedPublishRequest articleRelatedPublishRequest) throws Exception;
}
