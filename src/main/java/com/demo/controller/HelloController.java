package com.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "欢迎接口", notes = "欢迎接口", response = HelloResp.class)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public HelloResp hello(@ApiParam(value = "hello", required = true) @RequestParam(required = true) String index,
            @ApiParam(value = "hello", required = true) @RequestParam(required = true) String index2) {
        return new HelloResp();
    }

}