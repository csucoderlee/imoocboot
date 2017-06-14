package com.csu.coderlee.repository;

import com.csu.coderlee.domain.Boy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lixiang on 2017 06 14 下午11:04.
 */
public interface BoyRepository extends JpaRepository<Boy, Integer>{

    List<Boy> findByAge(Integer age);
}
