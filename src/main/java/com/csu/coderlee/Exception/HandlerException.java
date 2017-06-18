package com.csu.coderlee.Exception;

import com.csu.coderlee.domain.Result;
import com.csu.coderlee.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lixiang on 2017 06 18 下午10:55.
 */

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(Exception e) {

        if (e instanceof BoyException) {
            BoyException boyException = (BoyException) e;
            return ResultUtil.error(boyException.getCode(), boyException.getMessage());
        }
        return ResultUtil.error(-1, "未知异常");
    }
}
