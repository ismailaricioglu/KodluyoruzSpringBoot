package com.iaricioglu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")// url
//    @ResponseBody
    public String getThymeleaf1(){
//        return "ResponseBody ile değer döner";
        return "thymeleaf1"; // html döner
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")// url
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","Ben modelden geldim-1"); // html'nin içerisine gönderilir ve "key_model1" ile erişim sağlanır
        model.addAttribute("key_model2","Ben modelden geldim-2"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        return "thymeleaf1"; // html döner
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")// url
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","Ben modelden geldim-1"); // html'nin içerisine gönderilir ve "key_model1" ile erişim sağlanır
        model.addAttribute("key_model2","Ben modelden geldim-2"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        return "thymeleaf_file/thymeleaf3"; // html döner
    }
}
