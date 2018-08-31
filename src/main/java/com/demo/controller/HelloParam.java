package com.demo.controller;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: 云若
 * @date: 2018/8/30
 */
public class HelloParam {

    @ApiModelProperty(value = "名字", required = true, dataType = "string")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
