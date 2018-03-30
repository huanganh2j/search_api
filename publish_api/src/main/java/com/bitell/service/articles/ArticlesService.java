package com.bitell.service.articles;

import com.bitell.base.ApiError;
import com.bitell.entity.article.request.ArticlePublishRequest;
import com.bitell.entity.article.request.ArticleRelatedPublishRequest;
import com.bitell.entity.article.response.ArticlePublishResponse;
import com.bitell.entity.article.response.ArticleRelatedPublishResponse;
import com.bitell.mapper.ArticleSubRefMapper;
import com.bitell.mapper.CArticlesMapper;
import com.bitell.model.ArticleSubRef;
import com.bitell.model.CArticles;
import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/
@Service
public class ArticlesService implements ArticlesServiceI {
    Logger logger = LogManager.getLogger(ArticlesService.class);
    @Autowired
    CArticlesMapper cArticlesMapper;
    @Autowired
    ArticleSubRefMapper articleSubRefMapper;
    /**
     * 文章发布
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     *
     * @param articlePublishRequest
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public ArticlePublishResponse articlePublish(ArticlePublishRequest articlePublishRequest) throws Exception {
        try{
            if(CollectionUtils.isEmpty(articlePublishRequest.getSubjectIds())){
                return new ArticlePublishResponse(ApiError.SUBJECTIDS_IS_NULL,ApiError.SUBJECTIDS_IS_NULL_MESSAGE);
            }
            //插入文章表
            CArticles insertCArticles = new CArticles();
            BeanUtils.copyProperties(articlePublishRequest,insertCArticles);
            cArticlesMapper.insertSelective(insertCArticles);
            //添加主题与文章的关系
            articlePublishRequest.getSubjectIds().stream().forEach(sid->{
                ArticleSubRef insertArticleSubRef = new ArticleSubRef();
                insertArticleSubRef.setArticleId(insertCArticles.getId());
                insertArticleSubRef.setSubId(sid);
                articleSubRefMapper.insertSelective(insertArticleSubRef);
            });
            return new ArticlePublishResponse(ApiError.OK,ApiError.OK_MESSAGE,insertCArticles.getId());
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new Exception("新增失败");
        }
    }

    /**
     * 文章联合发布
     *
     * @param articleRelatedPublishRequest
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/30 20:40
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public ArticleRelatedPublishResponse articleRelatedPublish(ArticleRelatedPublishRequest articleRelatedPublishRequest) throws Exception {
        try{
            List<ArticlePublishRequest> articlePublishRequests = articleRelatedPublishRequest.getPublishRequests();
            if(CollectionUtils.isEmpty(articlePublishRequests)){
                return new ArticleRelatedPublishResponse(ApiError.PARAM_ERROR,ApiError.PARAM_ERROR_MESSAGE);
            }
            long suberrorCount =articlePublishRequests.stream().filter(apr->{
                return CollectionUtils.isEmpty(apr.getSubjectIds());
            }).count();

            if (suberrorCount>0){
                return new ArticleRelatedPublishResponse(ApiError.SUBJECTIDS_IS_NULL,ApiError.SUBJECTIDS_IS_NULL_MESSAGE);
            }
            //找出被转发的文章
            List<ArticlePublishRequest> fowardList = articlePublishRequests.stream().filter(apr->{
                return apr.getFowardFalge()==2;
            }).collect(Collectors.toList());

            //找出转发的文章
            List<ArticlePublishRequest> articleList = articlePublishRequests.stream().filter(apr->{
                return apr.getFowardFalge()==1;
            }).collect(Collectors.toList());
            if(CollectionUtils.isEmpty(fowardList) || CollectionUtils.isEmpty(articleList) ){
                return new ArticleRelatedPublishResponse(ApiError.PARAM_ERROR,ApiError.PARAM_ERROR_MESSAGE);
            }
            ArticlePublishRequest fowardArticlePublishRequest = fowardList.get(0);
            //插入被转发的文章
            CArticles insertCArticlesfoward = new CArticles();
            BeanUtils.copyProperties(fowardArticlePublishRequest,insertCArticlesfoward);
            cArticlesMapper.insertSelective(insertCArticlesfoward);
            //添加主题与文章的关系
            fowardArticlePublishRequest.getSubjectIds().stream().forEach(sid->{
                ArticleSubRef insertArticleSubRef = new ArticleSubRef();
                insertArticleSubRef.setArticleId(insertCArticlesfoward.getId());
                insertArticleSubRef.setSubId(sid);
                articleSubRefMapper.insertSelective(insertArticleSubRef);
            });
            ArticlePublishRequest articlePublishRequest = articleList.get(0);
            //插入文章
            CArticles insertCArticle = new CArticles();
            BeanUtils.copyProperties(articlePublishRequest,insertCArticle);
            insertCArticle.setForwardId(insertCArticlesfoward.getId());
            cArticlesMapper.insertSelective(insertCArticle);
            //添加主题与文章的关系
            articlePublishRequest.getSubjectIds().stream().forEach(sid->{
                ArticleSubRef insertArticleSubRef = new ArticleSubRef();
                insertArticleSubRef.setArticleId(insertCArticle.getId());
                insertArticleSubRef.setSubId(sid);
                articleSubRefMapper.insertSelective(insertArticleSubRef);
            });
            return new ArticleRelatedPublishResponse(ApiError.OK,ApiError.OK_MESSAGE);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new Exception("新增失败");
        }
    }
}
