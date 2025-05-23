package com.isai.demoecommerce.app.controller;

import com.isai.demoecommerce.app.model.Product;
import com.isai.demoecommerce.app.model.User;
import com.isai.demoecommerce.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/products")
@RequiredArgsConstructor
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

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
        User user = new User();
        user.setIdUser(1);
        user.setUsername("");
        user.setEmailUser("");
        user.setAddress("");
        user.setPasswordUser("");
        user.setPhone("");
        user.setTypeUser("");
        user.setFirstName("");
        user.setLastName("");
        LOGGER.info("Registering product of the view: {}", product);
        product.setUser(user);
        productService.saveProduct(product);
        return "redirect:/products";
    }

}
