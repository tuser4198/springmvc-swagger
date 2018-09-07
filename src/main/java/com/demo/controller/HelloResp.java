package com.demo.controller;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: 云若
 * @date: 2018/8/30
 */
public class HelloResp {

    public HelloResp(){

    }
    public HelloResp(String message){
        this.message=message;
    }

    @ApiModelProperty(value = "欢迎语",dataType = "string")
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
