package com.iaricioglu.tutorials.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class PostConstructTutorials {
//    @Autowired// inject
//    Logger LOG;

    // parametresiz constructor
    // because "this.LOG" is null
    /*public PostConstructTutorials() {
        LOG.info("Log info çağırıldı");
    }*/

    // bean henüz başlamadığından null alıyoruz ve burada bağımlılığı enjekte edemiyoruz
    // Görevi : Bir Bean nesnesi oluşturulduğunda aktif olmaktır
//    @PostConstruct
//    public  void  init(){
//        LOG.info("Log info çağırıldı");
//    }

//    public static void main(String[] args) {
//        PostConstructTutorials postConstructTutorials = new PostConstructTutorials();
//        System.out.println(postConstructTutorials);
//    }
}
