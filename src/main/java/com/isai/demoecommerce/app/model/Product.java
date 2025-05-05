package com.isai.demoecommerce.app.model;


import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "products")
@ToString
public class Product {
    private Integer idProduct;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private String productImage;
    private Integer quantity;
}
