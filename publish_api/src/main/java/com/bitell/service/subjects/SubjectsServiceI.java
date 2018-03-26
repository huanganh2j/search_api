package com.bitell.service.subjects;

import com.bitell.entity.subjects.request.SubjectsAddRequest;
import com.bitell.entity.subjects.request.SubjectsQueryByIdRequest;
import com.bitell.entity.subjects.request.SubjectsQueryByPageRequest;
import com.bitell.entity.subjects.response.*;

/**
*  @author an.huang
* @date 2018/3/26 19:19
*/
public interface SubjectsServiceI {
    /**
     * 新增主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 19:27
    */
    public SubjectsAddResponse addSubjects (SubjectsAddRequest subjectsAddRequest) throws Exception;

    /**
     * 修改主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 19:29
    */
    public SubjectsUpdateResponse updateSubjects(SubjectsUpdateResponse subjectsUpdateResponse)throws Exception;


    /**
     * 根据id查询主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 19:36
    */
    public SubjectsQueryByIdResponse queryById(SubjectsQueryByIdRequest subjectsQueryByIdRequest);


    /**
     * 分页查询主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 19:40
    */
    public SubjectsQueryByPageResponse queryByPage(SubjectsQueryByPageRequest subjectsQueryByPageRequest);


    /**
     * 查询所有主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 19:42
    */
    public SubjectsQueryAllResponse queryAll();
}
