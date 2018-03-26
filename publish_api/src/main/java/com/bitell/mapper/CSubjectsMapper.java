package com.bitell.mapper;

import com.bitell.model.CSubjects;
import com.bitell.model.CSubjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CSubjectsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    long countByExample(CSubjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int deleteByExample(CSubjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int insert(CSubjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int insertSelective(CSubjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    List<CSubjects> selectByExample(CSubjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    CSubjects selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByExampleSelective(@Param("record") CSubjects record, @Param("example") CSubjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByExample(@Param("record") CSubjects record, @Param("example") CSubjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByPrimaryKeySelective(CSubjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_subjects
     *
     * @mbg.generated Mon Mar 26 15:43:57 CST 2018
     */
    int updateByPrimaryKey(CSubjects record);
}