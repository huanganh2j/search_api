package com.bitell.entity.subjects.request;

import com.bitell.base.ApiRequest;

/**
*  @author an.huang
* @date 2018/3/26 19:36
*/
public class SubjectsQueryByPageRequest extends ApiRequest{
    private Integer pageSize;
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
