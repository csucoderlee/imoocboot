package com.csu.coderlee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiang on 2017 06 13 下午10:43.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String say() {
        return "hello spring boot";
    }
}
