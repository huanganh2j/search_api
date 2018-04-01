package com.ywxk.bitell.model.publish.subjects.response;


import com.ywxk.bitell.model.base.ApiResponse;

/**
*  @author an.huang 
* @date 2018/3/26 19:27
*/ 
public class SubjectsUpdateResponse extends ApiResponse{
    public SubjectsUpdateResponse() {
    }

    public SubjectsUpdateResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
