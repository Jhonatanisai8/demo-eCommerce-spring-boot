package com.isai.demoecommerce.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DemoECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoECommerceApplication.class, args);
    }

}
