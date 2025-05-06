package com.isai.demoecommerce.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@ToString(exclude = "user")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    private String productName;
    private String productDescription;
    private Double productPrice;
    private String productImage;
    private Integer quantity;

    @ManyToOne
    private User user;

}
