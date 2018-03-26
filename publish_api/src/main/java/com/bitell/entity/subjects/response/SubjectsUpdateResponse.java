package com.bitell.entity.subjects.response;

import com.bitell.base.ApiResponse;

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
