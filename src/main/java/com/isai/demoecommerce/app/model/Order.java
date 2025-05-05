package com.isai.demoecommerce.app.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "orders")
@ToString
public class Order {
    private Integer idOrder;
    private String numberOrder;
    private Date dateCreation;
    private Date dateReceived;
    private Double totalPrice;

}
