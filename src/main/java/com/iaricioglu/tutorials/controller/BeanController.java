package com.iaricioglu.tutorials.controller;

import com.iaricioglu.tutorials.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired// inject
    BeanConfig beanConfig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")// url
    @ResponseBody// html olmadan doğrudan ekranda göster
    public String getBeanDto(){
        return beanConfig.beanDto()+".";
    }
}
