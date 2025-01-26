package com.venky.Crud_Practice.rest;

public class StudentErrorResponse {
    private String error;

    private int status;

    private long timestamp;

    public StudentErrorResponse() {

    }

    public StudentErrorResponse(String error, int status, long timestamp) {
        this.error = error;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
