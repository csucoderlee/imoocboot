package com.csu.coderlee.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by lixiang on 2017 06 14 上午8:40.
 */

@RestController
public class ParamController {

    //localhost:8080/paramfrompath/10
    @RequestMapping(value = "paramfrompath/{id}", method = RequestMethod.GET)
    public String paramfrompath(@PathVariable("id") Integer myId) {
        return "id" + myId;
    }

    //localhost:8080/paramwithpath?id=10
    @RequestMapping(value = "paramwithpath", method = RequestMethod.GET)
    public String paramwithpath(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id" + myId;
    }

    @GetMapping(value = "getmapping")
    public String getmapping() {
        return "getmapping";
    }
}
