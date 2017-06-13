package com.csu.coderlee.controller;

import com.csu.coderlee.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiang on 2017 06 13 下午10:43.
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private String size;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private Girl girl;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String say() {
        return "hello spring boot";
    }

    @RequestMapping(value = "size", method = RequestMethod.GET)
    public String getSize() {
        return size + age;
    }

    @RequestMapping(value = "content", method = RequestMethod.GET)
    public String getContent() {
        return content;
    }

    @RequestMapping(value = "girl", method = RequestMethod.GET)
    public String girl() {
        return girl.getCupSize();
    }
}
