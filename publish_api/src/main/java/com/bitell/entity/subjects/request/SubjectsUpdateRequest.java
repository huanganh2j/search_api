package com.bitell.entity.subjects.request;

import com.bitell.base.ApiRequest;
import io.swagger.annotations.ApiModelProperty;

/**
*  @author an.huang 
* @date 2018/3/26 19:28
*/ 
public class SubjectsUpdateRequest extends ApiRequest{
    @ApiModelProperty(value = "主题id")
    private Integer id;
    @ApiModelProperty(value = "主题名称")
    private String subName;
    @ApiModelProperty(value = "主题icon url")
    private String subIcon;
    @ApiModelProperty(value = "主题描述")
    private String subDes;
    @ApiModelProperty(value = "主题管理员")
    private Integer subAdmin;
    @ApiModelProperty(value = "创建人id")
    private Integer createUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubIcon() {
        return subIcon;
    }

    public void setSubIcon(String subIcon) {
        this.subIcon = subIcon;
    }

    public String getSubDes() {
        return subDes;
    }

    public void setSubDes(String subDes) {
        this.subDes = subDes;
    }

    public Integer getSubAdmin() {
        return subAdmin;
    }

    public void setSubAdmin(Integer subAdmin) {
        this.subAdmin = subAdmin;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }
}
