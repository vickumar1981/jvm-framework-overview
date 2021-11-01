package com.example.helloWorld.model;


public class HelloWorldResponse {
    private String message;

    public HelloWorldResponse() {}

    public HelloWorldResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}