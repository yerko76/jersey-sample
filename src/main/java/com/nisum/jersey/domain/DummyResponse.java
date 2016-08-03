package com.nisum.jersey.domain;

import java.util.Date;

public class DummyResponse {
    private Date date;
    private String message;

    public DummyResponse(){

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

