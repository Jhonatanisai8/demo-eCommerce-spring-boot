package com.isai.demoecommerce.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/products")
public class ProductController {

    @GetMapping(path = "")
    public String showProducts() {
        return "products/show";
    }

    @GetMapping(path = "/createProduct")
    public String goToViewCreateProduct(){
        return "products/create";
    }

}
