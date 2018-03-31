package com.bitell.entity.articles.vo;

import io.swagger.annotations.ApiModelProperty;

/**
* Company:bitell
* Author:an.huang
* Date:2018/3/27
*/
public class AritcleSubRefVo {
    @ApiModelProperty(value = "主题id")
    private Integer id;
    @ApiModelProperty(value = "主题名称")
    private String subName;
    @ApiModelProperty(value = "主题icon url")
    private String subIcon;
    @ApiModelProperty(value = "主题描述")
    private String subDes;

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
}
