package com.bitell.mapper;

import com.bitell.model.CArticleCount;
import com.bitell.model.CArticleCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CArticleCountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    long countByExample(CArticleCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int deleteByExample(CArticleCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int insert(CArticleCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int insertSelective(CArticleCount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    List<CArticleCount> selectByExample(CArticleCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByExampleSelective(@Param("record") CArticleCount record, @Param("example") CArticleCountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_article_count
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByExample(@Param("record") CArticleCount record, @Param("example") CArticleCountExample example);
}