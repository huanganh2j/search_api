package com.bitell.model.publish.subjects.response;


import com.bitell.model.base.ApiResponse;
import com.bitell.model.publish.subjects.vo.subjects.SubjectsQueryVo;

import java.util.List;

/**
*  @author an.huang
* @date 2018/3/26 19:41
*/
public class SubjectsQueryAllResponse extends ApiResponse{
    private List<SubjectsQueryVo> vos;

    public SubjectsQueryAllResponse(List<SubjectsQueryVo> vos) {
        this.vos = vos;
    }

    public SubjectsQueryAllResponse(int errCode, String errMsg, List<SubjectsQueryVo> vos) {
        super(errCode, errMsg);
        this.vos = vos;
    }

    public SubjectsQueryAllResponse() {
    }

    public SubjectsQueryAllResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public List<SubjectsQueryVo> getVos() {
        return vos;
    }

    public void setVos(List<SubjectsQueryVo> vos) {
        this.vos = vos;
    }
}
