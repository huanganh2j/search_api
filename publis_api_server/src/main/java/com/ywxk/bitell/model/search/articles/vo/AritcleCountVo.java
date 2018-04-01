package com.ywxk.bitell.model.search.articles.vo;

import io.swagger.annotations.ApiModelProperty;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class AritcleCountVo {
    @ApiModelProperty(value = "文章点赞数")
    private Integer likes;
    @ApiModelProperty(value = "文章评论数")
    private Integer comments;
    @ApiModelProperty(value = "文章分享数")
    private Integer shareds;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getShareds() {
        return shareds;
    }

    public void setShareds(Integer shareds) {
        this.shareds = shareds;
    }
}
