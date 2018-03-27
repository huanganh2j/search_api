package com.bitell.entity.articles.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/3/27
*/
public class ArticlesQueryVo {
    @ApiModelProperty(value = "文章id")
    private Long id;
    @ApiModelProperty(value = "作者的用户id")
    private Integer authorId;
    @ApiModelProperty(value = "作者的用户类型。n:normal普通用户；v:vip认证用户")
    private String authorType;
    @ApiModelProperty(value = "文章标题")
    private String title;
    @ApiModelProperty(value = "文章创建时间")
    private Date createTime;
    @ApiModelProperty(value = "发布时间")
    private Date pubTime;
    @ApiModelProperty(value = "封面图1")
    private String coverImg1Url;
    @ApiModelProperty(value = "封面图2")
    private String coverImg2Url;
    @ApiModelProperty(value = "封面图3")
    private String coverImg3Url;
    @ApiModelProperty(value = "封面图4")
    private String coverImg4Url;
    @ApiModelProperty(value = "封面图5")
    private String coverImg5Url;
    @ApiModelProperty(value = "封面图6")
    private String coverImg6Url;
    @ApiModelProperty(value = "封面图7")
    private String coverImg7Url;
    @ApiModelProperty(value = "封面图8")
    private String coverImg8Url;
    @ApiModelProperty(value = "封面图9")
    private String coverImg9Url;
    @ApiModelProperty(value = "封面视频url")
    private String videoUrl;
    @ApiModelProperty(value = "源数据的url")
    private String sourceUrl;
    @ApiModelProperty(value = "带样式的文章内容")
    private String contentText;
    @ApiModelProperty(value = "文章主题对象")
    private List<AritcleSubRefVo> aritcleSubRefVos;
    @ApiModelProperty(value = "文章点赞、评论、分享数据对象")
    private AritcleCountVo aritcleCountVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorType() {
        return authorType;
    }

    public void setAuthorType(String authorType) {
        this.authorType = authorType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getCoverImg1Url() {
        return coverImg1Url;
    }

    public void setCoverImg1Url(String coverImg1Url) {
        this.coverImg1Url = coverImg1Url;
    }

    public String getCoverImg2Url() {
        return coverImg2Url;
    }

    public void setCoverImg2Url(String coverImg2Url) {
        this.coverImg2Url = coverImg2Url;
    }

    public String getCoverImg3Url() {
        return coverImg3Url;
    }

    public void setCoverImg3Url(String coverImg3Url) {
        this.coverImg3Url = coverImg3Url;
    }

    public String getCoverImg4Url() {
        return coverImg4Url;
    }

    public void setCoverImg4Url(String coverImg4Url) {
        this.coverImg4Url = coverImg4Url;
    }

    public String getCoverImg5Url() {
        return coverImg5Url;
    }

    public void setCoverImg5Url(String coverImg5Url) {
        this.coverImg5Url = coverImg5Url;
    }

    public String getCoverImg6Url() {
        return coverImg6Url;
    }

    public void setCoverImg6Url(String coverImg6Url) {
        this.coverImg6Url = coverImg6Url;
    }

    public String getCoverImg7Url() {
        return coverImg7Url;
    }

    public void setCoverImg7Url(String coverImg7Url) {
        this.coverImg7Url = coverImg7Url;
    }

    public String getCoverImg8Url() {
        return coverImg8Url;
    }

    public void setCoverImg8Url(String coverImg8Url) {
        this.coverImg8Url = coverImg8Url;
    }

    public String getCoverImg9Url() {
        return coverImg9Url;
    }

    public void setCoverImg9Url(String coverImg9Url) {
        this.coverImg9Url = coverImg9Url;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public List<AritcleSubRefVo> getAritcleSubRefVos() {
        return aritcleSubRefVos;
    }

    public void setAritcleSubRefVos(List<AritcleSubRefVo> aritcleSubRefVos) {
        this.aritcleSubRefVos = aritcleSubRefVos;
    }

    public AritcleCountVo getAritcleCountVo() {
        return aritcleCountVo;
    }

    public void setAritcleCountVo(AritcleCountVo aritcleCountVo) {
        this.aritcleCountVo = aritcleCountVo;
    }


}
