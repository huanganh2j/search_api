package com.bitell.service.subjects;

import com.bitell.base.ApiError;
import com.bitell.entity.subjects.request.SubjectsAddRequest;
import com.bitell.entity.subjects.request.SubjectsQueryByIdRequest;
import com.bitell.entity.subjects.request.SubjectsQueryByPageRequest;
import com.bitell.entity.subjects.response.*;
import com.bitell.mapper.CSubjectsMapper;
import com.bitell.model.CSubjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
     * @param subjectsUpdateResponse
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 19:29
     */
    @Override
    public SubjectsUpdateResponse updateSubjects(SubjectsUpdateResponse subjectsUpdateResponse) throws Exception {
        return null;
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
        return null;
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
        return null;
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
        return null;
    }
}
