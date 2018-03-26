package com.bitell.controller.subjects;

import com.bitell.base.ApiError;
import com.bitell.entity.subjects.request.*;
import com.bitell.entity.subjects.response.*;
import com.bitell.service.subjects.SubjectsService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author an.huang
 * @date 2018/3/26 19:54
 */
@Api(value = "SubjectsController", description = "主题相关接口")
@RestController
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    SubjectsService subjectsService;

    /**
     * 新增主题
     *
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 20:09
     */
    @ResponseBody
    @ApiOperation(value = "新增主题", notes = "新增主题接口", httpMethod = "POST", response = SubjectsAddResponse.class)
    @RequestMapping(value = "/addSubjects")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.ADD_FAILD, message = ApiError.ADD_FAILD_MESSAGE)
            }
    )
    public SubjectsAddResponse addSubjects(@RequestBody @ApiParam(name = "主题相关信息", value = "传入json格式 ", required = true) SubjectsAddRequest subjectsAddRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            SubjectsAddResponse subjectsAddResponse = subjectsService.addSubjects(subjectsAddRequest);
            return subjectsAddResponse;
        } catch (Exception e) {
            return new SubjectsAddResponse(ApiError.ADD_FAILD, ApiError.ADD_FAILD_MESSAGE);
        }
    }

    /**
     * 修改主题
     *
     * @return
     * @param:
     * @author an.huang
     * @date 2018/3/26 20:09
     */
    @ResponseBody
    @ApiOperation(value = "修改主题", notes = "修改主题接口", httpMethod = "POST", response = SubjectsUpdateResponse.class)
    @RequestMapping(value = "/updateSubjects")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.UPDATE_FAILD, message = ApiError.UPDATE_FAILD_MESSAGE)
            }
    )
    public SubjectsUpdateResponse updateSubjects(@RequestBody @ApiParam(name = "主题相关信息", value = "传入json格式 ", required = true) SubjectsUpdateRequest subjectsUpdateRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            SubjectsUpdateResponse subjectsUpdateResponse = subjectsService.updateSubjects(subjectsUpdateRequest);
            return subjectsUpdateResponse;
        } catch (Exception e) {
            return new SubjectsUpdateResponse(ApiError.UPDATE_FAILD, ApiError.UPDATE_FAILD_MESSAGE);
        }
    }

    /**
     * 根据主题id查询主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 20:23
    */
    @ResponseBody
    @ApiOperation(value = "根据主题id查询主题", notes = "根据主题id查询主题接口", httpMethod = "POST", response = SubjectsQueryByIdResponse.class)
    @RequestMapping(value = "/queryById")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.QUERY_FAILD, message = ApiError.QUERY_FAILD_MESSAGE)
            }
    )
    public SubjectsQueryByIdResponse queryById(@RequestBody @ApiParam(name = "主题相关信息", value = "传入json格式 ", required = true) SubjectsQueryByIdRequest subjectsQueryByIdRequest, HttpServletRequest request, HttpServletResponse response) {
        SubjectsQueryByIdResponse subjectsQueryByIdResponse = subjectsService.queryById(subjectsQueryByIdRequest);
        return subjectsQueryByIdResponse;
    }


    /**
     * 分页查询主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 20:43
    */
    @ResponseBody
    @ApiOperation(value = "分页查询主题", notes = "分页查询主题接口", httpMethod = "POST", response = SubjectsQueryByPageResponse.class)
    @RequestMapping(value = "/queryByPage")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.QUERY_FAILD, message = ApiError.QUERY_FAILD_MESSAGE)
            }
    )
    public SubjectsQueryByPageResponse queryByPage(@RequestBody @ApiParam(name = "主题相关信息", value = "传入json格式 ", required = true) SubjectsQueryByPageRequest subjectsQueryByPageRequest, HttpServletRequest request, HttpServletResponse response) {
        SubjectsQueryByPageResponse subjectsQueryByPageResponse = subjectsService.queryByPage(subjectsQueryByPageRequest);
        return subjectsQueryByPageResponse;
    }

    /**
     * 删除主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 21:18
    */
    @ResponseBody
    @ApiOperation(value = "删除主题", notes = "删除主题接口", httpMethod = "POST", response = SubjectsDeleteResponse.class)
    @RequestMapping(value = "/deleteSubjects")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.DELETE_FAILD, message = ApiError.DELETE_FAILD_MESSAGE)
            }
    )
    public SubjectsDeleteResponse deleteSubjects(@RequestBody @ApiParam(name = "主题相关信息", value = "传入json格式 ", required = true) SubjectsDeleteRequest subjectsDeleteRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            SubjectsDeleteResponse subjectsDeleteResponse = subjectsService.deleteSubjects(subjectsDeleteRequest);
            return subjectsDeleteResponse;
        }catch (Exception e){
            return new SubjectsDeleteResponse(ApiError.DELETE_FAILD,ApiError.DELETE_FAILD_MESSAGE);
        }
    }



    /**
     * 查询所有主题
    * @param:
    * @return
    * @author an.huang
    * @date 2018/3/26 20:46
    */
    @ResponseBody
    @ApiOperation(value = "查询所有主题", notes = "查询所有主题接口", httpMethod = "POST", response = SubjectsQueryAllResponse.class)
    @RequestMapping(value = "/queryAll")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.QUERY_FAILD, message = ApiError.QUERY_FAILD_MESSAGE)
            }
    )
    public SubjectsQueryAllResponse queryAll(HttpServletRequest request, HttpServletResponse response) {
        SubjectsQueryAllResponse subjectsQueryAllResponse = subjectsService.queryAll();
        return subjectsQueryAllResponse;
    }

}
