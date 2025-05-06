package com.isai.demoecommerce.app.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
@ToString(exclude = {"user","detailOrder"})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrder;

    private String numberOrder;

    private Date dateCreation;

    private Date dateReceived;

    private Double totalPrice;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "order")
    private DetailOrder detailOrder;

}
