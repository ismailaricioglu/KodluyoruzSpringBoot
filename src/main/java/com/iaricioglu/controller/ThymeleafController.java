package com.iaricioglu.controller;

import com.iaricioglu.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //    @ResponseBody
    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")// url
//    @ResponseBody
    public String getThymeleaf1() {
//        return "ResponseBody ile değer döner";
        return "thymeleaf1"; // html döner
    }

    //    Model
    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")// url
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1"); // html'nin içerisine gönderilir ve "key_model1" ile erişim sağlanır
        model.addAttribute("key_model2", "Ben modelden geldim-2"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        return "thymeleaf1"; // html döner
    }

    //    Model birden fazla model göndermek
    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")// url
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1"); // html'nin içerisine gönderilir ve "key_model1" ile erişim sağlanır
        model.addAttribute("key_model2", "Ben modelden geldim-2"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        return "thymeleaf_file/thymeleaf3"; // html döner
    }

    // http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")// url
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-4"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        return "thymeleaf4"; // html döner
    }

    ////////////////////////////////////////////////////////////////////////////////////

    // Model Object
    // http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")// url
    public String getThymeleaf5Model(Model model) {
        model.addAttribute("key_model1", "text"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        ProductDto productDto = ProductDto
                .builder()
                .productId(0L)
                .productName("Ürün adı")
                .productPrice(2500)
                .build();
        model.addAttribute("key_model2", productDto); // html'nin içerisine Obje gönderilir
        return "thymeleaf5"; // html döner
    }

    // Model Object
    // http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")// url
    public String getThymeleaf6ModelList(Model model) {
        model.addAttribute("key_model1", "text"); // html'nin içerisine gönderilir ve "key_model2" ile erişim sağlanır
        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add(ProductDto.builder().productId(0L).productName("Ürün adı0").productPrice(0500).build());
        productDtoList.add(ProductDto.builder().productId(1L).productName("Ürün adı1").productPrice(1500).build());
        productDtoList.add(ProductDto.builder().productId(2L).productName("Ürün adı2").productPrice(2500).build());
        productDtoList.add(ProductDto.builder().productId(3L).productName("Ürün adı3").productPrice(3500).build());
        model.addAttribute("product_list", productDtoList); // html'nin içerisine Obje gönderilir
        return "thymeleaf6"; // html döner
    }

    ////////////////////////////////////////////////////////////////////////////////////
    // @PathVariable
    // http://localhost:8080/thymeleaf7/4
    // http://localhost:8080/thymeleaf7
    @GetMapping({"/thymeleaf7", "/thymeleaf7/{id}"})// url
    public String getThymeleaf7ModeObject(Model model, @PathVariable(name = "id", required = false) Long id) {
        if (id != null) {
            model.addAttribute("key_model1", "id: " + id);
        } else {
            model.addAttribute("key_model1", "id bulunamadı");
        }
        return "thymeleaf7"; // html döner
    }
}
