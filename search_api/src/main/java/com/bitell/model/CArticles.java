package com.bitell.model;

import java.io.Serializable;
import java.util.Date;

public class CArticles implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.author_id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Integer authorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.author_type
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String authorType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.title
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.sub_ids
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String subIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.is_delete
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Byte isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.status
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.create_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.pub_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private Date pubTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img1_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg1Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img2_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg2Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img3_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg3Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img4_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg4Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img5_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg5Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img6_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg6Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img7_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg7Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img8_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg8Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.cover_img9_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String coverImg9Url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.video_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String videoUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.source_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String sourceUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_articles.content_text
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private String contentText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table c_articles
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.id
     *
     * @return the value of c_articles.id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.id
     *
     * @param id the value for c_articles.id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.author_id
     *
     * @return the value of c_articles.author_id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.author_id
     *
     * @param authorId the value for c_articles.author_id
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.author_type
     *
     * @return the value of c_articles.author_type
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getAuthorType() {
        return authorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.author_type
     *
     * @param authorType the value for c_articles.author_type
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setAuthorType(String authorType) {
        this.authorType = authorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.title
     *
     * @return the value of c_articles.title
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.title
     *
     * @param title the value for c_articles.title
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.sub_ids
     *
     * @return the value of c_articles.sub_ids
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getSubIds() {
        return subIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.sub_ids
     *
     * @param subIds the value for c_articles.sub_ids
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setSubIds(String subIds) {
        this.subIds = subIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.is_delete
     *
     * @return the value of c_articles.is_delete
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.is_delete
     *
     * @param isDelete the value for c_articles.is_delete
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.status
     *
     * @return the value of c_articles.status
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.status
     *
     * @param status the value for c_articles.status
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.create_time
     *
     * @return the value of c_articles.create_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.create_time
     *
     * @param createTime the value for c_articles.create_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.pub_time
     *
     * @return the value of c_articles.pub_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public Date getPubTime() {
        return pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.pub_time
     *
     * @param pubTime the value for c_articles.pub_time
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img1_url
     *
     * @return the value of c_articles.cover_img1_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg1Url() {
        return coverImg1Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img1_url
     *
     * @param coverImg1Url the value for c_articles.cover_img1_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg1Url(String coverImg1Url) {
        this.coverImg1Url = coverImg1Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img2_url
     *
     * @return the value of c_articles.cover_img2_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg2Url() {
        return coverImg2Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img2_url
     *
     * @param coverImg2Url the value for c_articles.cover_img2_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg2Url(String coverImg2Url) {
        this.coverImg2Url = coverImg2Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img3_url
     *
     * @return the value of c_articles.cover_img3_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg3Url() {
        return coverImg3Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img3_url
     *
     * @param coverImg3Url the value for c_articles.cover_img3_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg3Url(String coverImg3Url) {
        this.coverImg3Url = coverImg3Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img4_url
     *
     * @return the value of c_articles.cover_img4_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg4Url() {
        return coverImg4Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img4_url
     *
     * @param coverImg4Url the value for c_articles.cover_img4_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg4Url(String coverImg4Url) {
        this.coverImg4Url = coverImg4Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img5_url
     *
     * @return the value of c_articles.cover_img5_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg5Url() {
        return coverImg5Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img5_url
     *
     * @param coverImg5Url the value for c_articles.cover_img5_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg5Url(String coverImg5Url) {
        this.coverImg5Url = coverImg5Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img6_url
     *
     * @return the value of c_articles.cover_img6_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg6Url() {
        return coverImg6Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img6_url
     *
     * @param coverImg6Url the value for c_articles.cover_img6_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg6Url(String coverImg6Url) {
        this.coverImg6Url = coverImg6Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img7_url
     *
     * @return the value of c_articles.cover_img7_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg7Url() {
        return coverImg7Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img7_url
     *
     * @param coverImg7Url the value for c_articles.cover_img7_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg7Url(String coverImg7Url) {
        this.coverImg7Url = coverImg7Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img8_url
     *
     * @return the value of c_articles.cover_img8_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg8Url() {
        return coverImg8Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img8_url
     *
     * @param coverImg8Url the value for c_articles.cover_img8_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg8Url(String coverImg8Url) {
        this.coverImg8Url = coverImg8Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.cover_img9_url
     *
     * @return the value of c_articles.cover_img9_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getCoverImg9Url() {
        return coverImg9Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.cover_img9_url
     *
     * @param coverImg9Url the value for c_articles.cover_img9_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setCoverImg9Url(String coverImg9Url) {
        this.coverImg9Url = coverImg9Url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.video_url
     *
     * @return the value of c_articles.video_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.video_url
     *
     * @param videoUrl the value for c_articles.video_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.source_url
     *
     * @return the value of c_articles.source_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.source_url
     *
     * @param sourceUrl the value for c_articles.source_url
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_articles.content_text
     *
     * @return the value of c_articles.content_text
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_articles.content_text
     *
     * @param contentText the value for c_articles.content_text
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_articles
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", authorId=").append(authorId);
        sb.append(", authorType=").append(authorType);
        sb.append(", title=").append(title);
        sb.append(", subIds=").append(subIds);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", pubTime=").append(pubTime);
        sb.append(", coverImg1Url=").append(coverImg1Url);
        sb.append(", coverImg2Url=").append(coverImg2Url);
        sb.append(", coverImg3Url=").append(coverImg3Url);
        sb.append(", coverImg4Url=").append(coverImg4Url);
        sb.append(", coverImg5Url=").append(coverImg5Url);
        sb.append(", coverImg6Url=").append(coverImg6Url);
        sb.append(", coverImg7Url=").append(coverImg7Url);
        sb.append(", coverImg8Url=").append(coverImg8Url);
        sb.append(", coverImg9Url=").append(coverImg9Url);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", sourceUrl=").append(sourceUrl);
        sb.append(", contentText=").append(contentText);
        sb.append("]");
        return sb.toString();
    }
}