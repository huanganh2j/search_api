package com.ywxk.bitell.model.publish.subjects.request;

import com.ywxk.bitell.model.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang
* @date 2018/3/26 19:36
*/
public class SubjectsQueryByPageRequest extends ApiRequest{
    @ApiModelProperty(value = "分页参数，每页数据量")
    private Integer pageSize;
    @ApiModelProperty(value = "分页参数，当前页码")
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
