package com.csu.coderlee.util;

import com.csu.coderlee.domain.Result;

/**
 * Created by lixiang on 2017 06 17 下午6:44.
 */
public class ResultUtil {

    public static Result success(Object o) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(o);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
