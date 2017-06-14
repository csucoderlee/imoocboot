package com.csu.coderlee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lixiang on 2017 06 14 上午8:33.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/controller", method = RequestMethod.GET)
    public String controller() {
        return "index";
    }
}
