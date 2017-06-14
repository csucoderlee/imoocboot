package com.csu.coderlee.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lixiang on 2017 06 14 下午10:58.
 */
@Entity
public class Boy {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer age;

    public Boy() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
