package com.demo.controller;

/**
 * @author: 云若
 * @date: 2018/9/5
 */
public class Response<T> {

    private String error;

    private T body;

    public Response(String error) {
        this.error = error;
    }

    public Response(T body) {
        this.body = body;
    }

    public Response(String error, T body) {
        this.error = error;
        this.body = body;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
