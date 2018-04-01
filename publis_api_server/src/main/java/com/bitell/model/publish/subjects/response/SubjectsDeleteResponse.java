package com.bitell.model.publish.subjects.response;


import com.bitell.model.base.ApiResponse;

/**
 * Created by huangan on 2018/3/26.
 */
public class SubjectsDeleteResponse extends ApiResponse {
    public SubjectsDeleteResponse() {
    }

    public SubjectsDeleteResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
