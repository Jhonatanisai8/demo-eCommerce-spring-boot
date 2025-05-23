package com.isai.demoecommerce.app.controller;

import com.isai.demoecommerce.app.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/products")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @GetMapping(path = "")
    public String showProducts() {
        return "products/show";
    }

    @GetMapping(path = "/createProduct")
    public String goToViewCreateProduct() {
        return "products/create";
    }

    @PostMapping(path = "/registerProduct")
    public String registerProduct(
            Product product) {
        LOGGER.info("Registering product of the view: {}", product);
        return "redirect:/products";
    }

}
