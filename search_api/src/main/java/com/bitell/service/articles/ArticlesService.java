package com.bitell.service.articles;

import com.bitell.base.ApiError;
import com.bitell.entity.articles.request.ArticlesQueryByIdRequest;
import com.bitell.entity.articles.request.ArticlesQueryListRequest;
import com.bitell.entity.articles.response.ArticlesQueryByIdResponse;
import com.bitell.entity.articles.response.ArticlesQueryListResponse;
import com.bitell.entity.articles.vo.ArticlesQueryVo;
import com.bitell.mapper.CArticlesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Company:bitell
 * Author:an.huang
 * Date:2018/3/27
 */
@Service
public class ArticlesService implements ArticlesServiceI {
    Logger logger = LogManager.getLogger(ArticlesService.class);
    @Autowired
    CArticlesMapper cArticlesMapper;

    /**
     * 分页查询最新文章
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     *
     * @param articlesQueryListRequest
     */
    @Override
    public ArticlesQueryListResponse queryByPage(ArticlesQueryListRequest articlesQueryListRequest) {
        try {
            PageHelper.startPage(articlesQueryListRequest.getPageNum(), articlesQueryListRequest.getPageSize());
            List<ArticlesQueryVo> queryVoList = cArticlesMapper.selectByPage(new HashMap<>());
            PageInfo<ArticlesQueryVo> pageData = new PageInfo<ArticlesQueryVo>(queryVoList);
            ArticlesQueryListResponse articlesQueryListResponse = new ArticlesQueryListResponse(ApiError.OK, ApiError.OK_MESSAGE);
            articlesQueryListResponse.setVos(pageData.getList());
            articlesQueryListResponse.setCurrentPage(pageData.getPageNum());
            articlesQueryListResponse.setPageSize(pageData.getPageSize());
            articlesQueryListResponse.setTotalCount(pageData.getTotal());
            articlesQueryListResponse.setTotalPage(pageData.getPages());
            return articlesQueryListResponse;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return new ArticlesQueryListResponse(ApiError.QUERY_FAILD, ApiError.QUERY_FAILD_MESSAGE);
        }
    }

    /**
     * 根据id查询文章内容
     * Author:an.huang
     * Descriptions:
     * Date:2018/3/27
     *
     * @param articlesQueryByIdRequest
     */
    @Override
    public ArticlesQueryByIdResponse queryById(ArticlesQueryByIdRequest articlesQueryByIdRequest) {
        try {
            ArticlesQueryVo articlesQueryVo = cArticlesMapper.selectById(articlesQueryByIdRequest.getId());
            return new ArticlesQueryByIdResponse(ApiError.OK,ApiError.OK_MESSAGE,articlesQueryVo);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return new ArticlesQueryByIdResponse(ApiError.QUERY_FAILD, ApiError.QUERY_FAILD_MESSAGE);
        }
    }
}
