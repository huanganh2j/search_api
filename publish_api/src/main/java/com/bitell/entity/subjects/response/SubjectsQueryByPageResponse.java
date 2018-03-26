package com.bitell.entity.subjects.response;

import com.bitell.base.ApiResponse;
import com.bitell.entity.subjects.vo.subjects.SubjectsQueryVo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
*  @author an.huang
* @date 2018/3/26 19:37
*/
public class SubjectsQueryByPageResponse extends ApiResponse{
    @ApiModelProperty(value = "数据集")
    private List<SubjectsQueryVo> vos;
    @ApiModelProperty(value = "总数量")
    private Long totalCount;
    @ApiModelProperty(value = "总页数")
    private Integer totalPage;
    @ApiModelProperty(value = "当前页码")
    private Integer currentPage;
    @ApiModelProperty(value = "每页数据量")
    private Integer pageSize;

    public List<SubjectsQueryVo> getVos() {
        return vos;
    }

    public void setVos(List<SubjectsQueryVo> vos) {
        this.vos = vos;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public SubjectsQueryByPageResponse() {
    }

    public SubjectsQueryByPageResponse(int errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
