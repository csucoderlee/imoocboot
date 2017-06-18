package com.csu.coderlee.Exception;

/**
 * Created by lixiang on 2017 06 18 下午10:57.
 *
 * extends RuntimeException spring只会对RuntimeException进行事务回滚
 */
public class BoyException extends RuntimeException {

    private Integer code;

    public BoyException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
