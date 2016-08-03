package com.nisum.jersey.domain;

public class DummyResponseWrapper {
    private DummyResponse response;
    private Integer code;
    private Boolean status;

    public DummyResponseWrapper(){

    }

    public DummyResponse getResponse() {
        return response;
    }

    public void setResponse(DummyResponse response) {
        this.response = response;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
