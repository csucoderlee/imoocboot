package com.csu.coderlee.Exception;

/**
 * Created by lixiang on 2017 06 18 下午11:03.
 */
public enum ExceptionEnum {

    UNKOWN_ERROR(-1, "未知错误");

    private Integer code;
    private String message;

    ExceptionEnum(Integer code, String message) {

        this.code = code;
        this.message = message;

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
