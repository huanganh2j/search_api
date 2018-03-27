package com.bitell.model;

import java.io.Serializable;

public class ArticleSubRef implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_sub_ref.id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_sub_ref.article_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_sub_ref.sub_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    private Integer subId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_sub_ref
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_sub_ref.id
     *
     * @return the value of article_sub_ref.id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_sub_ref.id
     *
     * @param id the value for article_sub_ref.id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_sub_ref.article_id
     *
     * @return the value of article_sub_ref.article_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_sub_ref.article_id
     *
     * @param articleId the value for article_sub_ref.article_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_sub_ref.sub_id
     *
     * @return the value of article_sub_ref.sub_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public Integer getSubId() {
        return subId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_sub_ref.sub_id
     *
     * @param subId the value for article_sub_ref.sub_id
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_sub_ref
     *
     * @mbg.generated Tue Mar 27 10:50:56 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleId=").append(articleId);
        sb.append(", subId=").append(subId);
        sb.append("]");
        return sb.toString();
    }
}