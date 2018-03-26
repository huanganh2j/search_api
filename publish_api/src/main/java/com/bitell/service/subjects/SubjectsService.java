package com.bitell.service.subjects;

import com.bitell.base.ApiError;
import com.bitell.entity.subjects.request.*;
import com.bitell.entity.subjects.response.*;
import com.bitell.entity.subjects.vo.subjects.SubjectsQueryVo;
import com.bitell.mapper.CSubjectsMapper;
import com.bitell.model.CSubjects;
import com.bitell.model.CSubjectsExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*  @author an.huang
* @date 2018/3/26 19:43
*/
@Service
public class SubjectsService implements SubjectsServiceI{
    Logger logger = LogManager.getLogger(SubjectsService.class);
    @Autowired
    CSubjectsMapper cSubjectsMapper;
    /**
     * 新增主题
     *
     * @param subjectsAddRequest
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:27
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public SubjectsAddResponse addSubjects(SubjectsAddRequest subjectsAddRequest) throws Exception {
        try{
            CSubjects cSubjects = new CSubjects();
            BeanUtils.copyProperties(subjectsAddRequest,cSubjects);
            cSubjectsMapper.insertSelective(cSubjects);
            SubjectsAddResponse subjectsAddResponse = new SubjectsAddResponse(ApiError.OK,ApiError.OK_MESSAGE,cSubjects.getId());
            return subjectsAddResponse;
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            throw new Exception("新增失败");
        }
    }

    /**
     * 修改主题
     *
     * @param
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:29
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public SubjectsUpdateResponse updateSubjects(SubjectsUpdateRequest subjectsUpdateRequest) throws Exception {
        try{
            CSubjects cSubjects = new CSubjects();
            BeanUtils.copyProperties(subjectsUpdateRequest,cSubjects);
            cSubjectsMapper.updateByPrimaryKeySelective(cSubjects);
            return new SubjectsUpdateResponse(ApiError.OK,ApiError.OK_MESSAGE);
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            throw new Exception("修改失败");
        }
    }

    /**
     * 根据id查询主题
     *
     * @param subjectsQueryByIdRequest
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:36
     */
    @Override
    public SubjectsQueryByIdResponse queryById(SubjectsQueryByIdRequest subjectsQueryByIdRequest) {
        try{
            SubjectsQueryVo subjectsQueryVo = new SubjectsQueryVo();
            CSubjects cSubjects =cSubjectsMapper.selectByPrimaryKey(subjectsQueryByIdRequest.getId());
            BeanUtils.copyProperties(cSubjects,subjectsQueryVo);
            return new SubjectsQueryByIdResponse(ApiError.OK,ApiError.OK_MESSAGE,subjectsQueryVo);
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            return new SubjectsQueryByIdResponse(ApiError.QUERY_FAILD,ApiError.QUERY_FAILD_MESSAGE);
        }
    }

    /**
     * 分页查询主题
     *
     * @param subjectsQueryByPageRequest
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:40
     */
    @Override
    public SubjectsQueryByPageResponse queryByPage(SubjectsQueryByPageRequest subjectsQueryByPageRequest) {
        try{
            PageHelper.startPage(subjectsQueryByPageRequest.getPageNum(), subjectsQueryByPageRequest.getPageSize());
            List<SubjectsQueryVo> vos =cSubjectsMapper.selectByPage(new HashMap<>());
            PageInfo<SubjectsQueryVo> pageData = new PageInfo<SubjectsQueryVo>(vos);
            SubjectsQueryByPageResponse subjectsQueryByPageResponse = new SubjectsQueryByPageResponse(ApiError.OK,ApiError.OK_MESSAGE);
            subjectsQueryByPageResponse.setVos(pageData.getList());
            subjectsQueryByPageResponse.setCurrentPage(pageData.getPageNum());
            subjectsQueryByPageResponse.setPageSize(pageData.getPageSize());
            subjectsQueryByPageResponse.setTotalCount(pageData.getTotal());
            subjectsQueryByPageResponse.setTotalPage(pageData.getPages());
            return subjectsQueryByPageResponse;
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            return new SubjectsQueryByPageResponse(ApiError.QUERY_FAILD,ApiError.QUERY_FAILD_MESSAGE);
        }
    }

    /**
     * 删除主题
     *
     * @param subjectsDeleteRequest
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 21:09
     */
    @Override
    public SubjectsDeleteResponse deleteSubjects(SubjectsDeleteRequest subjectsDeleteRequest) throws Exception {
        try{
            CSubjects cSubjects = new CSubjects();
            cSubjects.setId(subjectsDeleteRequest.getId());
            cSubjects.setIsDelete((byte)1);
            cSubjectsMapper.updateByPrimaryKeySelective(cSubjects);
            return new SubjectsDeleteResponse(ApiError.OK,ApiError.OK_MESSAGE);
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            throw new Exception("删除失败");
        }
    }

    /**
     * 查询所有主题
     *
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:42
     */
    @Override
    public SubjectsQueryAllResponse queryAll() {
        try{
            List<SubjectsQueryVo> vos =cSubjectsMapper.selectByPage(new HashMap<>());
            SubjectsQueryAllResponse subjectsQueryByPageResponse = new SubjectsQueryAllResponse(ApiError.OK,ApiError.OK_MESSAGE,vos);
            return subjectsQueryByPageResponse;
        }catch (Exception e){
            e.getMessage();
            logger.error(e.getMessage());
            return new SubjectsQueryAllResponse(ApiError.QUERY_FAILD,ApiError.QUERY_FAILD_MESSAGE);
        }
    }
}
