package com.example.demo.model;

public class error {
    private String title;
    private Integer status;
    private String message;

    public error(String title, Integer status, String message) {
        this.title = title;
        this.status = status;
        this.message = message;
    }

    // #region Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // #endregion

}
