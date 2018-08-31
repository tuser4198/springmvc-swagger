package com.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: 云若
 * @date: 2018/8/30
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    private static final String BASE_PACKAGE = "com.demo";

    @Bean
    public Docket helloDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                //用于分组功能
                .groupName("hello")
                //注册整体api信息
                .apiInfo(apiInfo())
                .select()
                //指定扫描的包
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                //设置此组只匹配hello/**的请求
                .paths(PathSelectors.ant("/hello/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("test")
                .contact(new Contact("yunruo", "", ""))
                .version("1.0.0")
                .build();
    }

}
