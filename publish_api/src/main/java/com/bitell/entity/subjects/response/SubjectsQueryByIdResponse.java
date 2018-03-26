package com.bitell.entity.subjects.response;

import com.bitell.base.ApiResponse;
import com.bitell.entity.subjects.vo.subjects.SubjectsQueryVo;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang 
* @date 2018/3/26 19:32
*/ 
public class SubjectsQueryByIdResponse extends ApiResponse {
    private SubjectsQueryVo subjectsQueryVo;

    public SubjectsQueryByIdResponse() {
    }

    public SubjectsQueryByIdResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public SubjectsQueryByIdResponse(SubjectsQueryVo subjectsQueryVo) {
        this.subjectsQueryVo = subjectsQueryVo;
    }

    public SubjectsQueryByIdResponse(int errCode, String errMsg, SubjectsQueryVo subjectsQueryVo) {
        super(errCode, errMsg);
        this.subjectsQueryVo = subjectsQueryVo;
    }

    public SubjectsQueryVo getSubjectsQueryVo() {
        return subjectsQueryVo;
    }

    public void setSubjectsQueryVo(SubjectsQueryVo subjectsQueryVo) {
        this.subjectsQueryVo = subjectsQueryVo;
    }
}
