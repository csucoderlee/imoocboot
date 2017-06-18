package com.csu.coderlee.controller;

import com.csu.coderlee.Exception.BoyException;
import com.csu.coderlee.Exception.ExceptionEnum;
import com.csu.coderlee.domain.Boy;
import com.csu.coderlee.domain.Result;
import com.csu.coderlee.repository.BoyRepository;
import com.csu.coderlee.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lixiang on 2017 06 14 下午11:02.
 */
@RestController
public class BoyController {

    @Autowired
    private BoyRepository boyRepository;

    @GetMapping(value = "/boys")
    public List<Boy> boyList() {
        return boyRepository.findAll();
    }

    @PostMapping(value = "/boys")
    public Boy boyAdd(@RequestParam("age") Integer age){
        Boy boy = new Boy();
        boy.setAge(age);
        return boyRepository.save(boy);
    }

    @PostMapping(value = "/object/boys")
    public Result<Boy> boyAddByObject(@Valid Boy boy, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {

//            Result result = new Result();
//            result.setCode(1);
//            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
//            return result;
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(boyRepository.save(boy));
        return result;
    }

    @GetMapping(value = "/boys/{id}")
    public Boy boyFindOne(@PathVariable("id") Integer id) {
        Boy boy = boyRepository.findOne(id);

        if (boy.getAge() < 18) {
            throw new BoyException(ExceptionEnum.UNKOWN_ERROR);
        }
        return boy;
    }

    //xxx-form
    @PutMapping(value = "/boys/{id}")
    public Boy boyUpdate(@PathVariable("id") Integer id,
                         @RequestParam("age") Integer age) {
        Boy boy = new Boy();
        boy.setId(id);
        boy.setAge(age);
        return boyRepository.save(boy);
    }

    @DeleteMapping(value = "/boys/{id}")
    public void boyDelete(@PathVariable("id") Integer id) {
        boyRepository.delete(id);
    }

    //通过其他字段查询 需要在repository中声明
    @GetMapping(value = "/boys/{age}")
    public List<Boy> boyListByAge(@PathVariable("age") Integer age) {
        return boyRepository.findByAge(age);
    }
}
