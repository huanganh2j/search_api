package com.bitell.entity.article.request;

import com.bitell.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
*  @author an.huang 
* @date 2018/3/30 20:31
*/ 
public class ArticleRelatedPublishRequest extends ApiRequest{
    @ApiModelProperty(value = "关联发布的文章集(文章与转发文章为一组)")
    List<ArticlePublishRequest> publishRequests;

    public List<ArticlePublishRequest> getPublishRequests() {
        return publishRequests;
    }

    public void setPublishRequests(List<ArticlePublishRequest> publishRequests) {
        this.publishRequests = publishRequests;
    }
}
