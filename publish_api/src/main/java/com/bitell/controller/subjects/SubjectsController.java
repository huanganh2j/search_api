package com.bitell.controller.subjects;

import com.bitell.base.ApiError;
import com.bitell.entity.subjects.request.SubjectsAddRequest;
import com.bitell.entity.subjects.response.SubjectsAddResponse;
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
*  @author an.huang 
* @date 2018/3/26 19:54
*/
@Api(value = "SubjectsController", description = "主题相关接口")
@RestController
@RequestMapping("/subjects")
public class SubjectsController {
    @Autowired
    SubjectsService subjectsService;
    @ResponseBody
    @ApiOperation(value = "新增主题", notes = "新增主题接口", httpMethod = "POST",response = SubjectsAddResponse.class)
    @RequestMapping(value = "/addSubjects")
    @ApiResponses(value =
            {@ApiResponse(code = ApiError.OK, message = ApiError.OK_MESSAGE),
                    @ApiResponse(code = ApiError.ADD_FAILD, message = ApiError.ADD_FAILD_MESSAGE)
            }
    )
    public SubjectsAddResponse addSubjects(@RequestBody @ApiParam(name = "活动相关信息", value = "传入json格式 ", required = true) SubjectsAddRequest subjectsAddRequest, HttpServletRequest request, HttpServletResponse response) {
        try {
            SubjectsAddResponse subjectsAddResponse =subjectsService.addSubjects(subjectsAddRequest);
            return subjectsAddResponse;
        } catch (Exception e) {
            return new SubjectsAddResponse(ApiError.ADD_FAILD, ApiError.ADD_FAILD_MESSAGE);
        }
    }
}
