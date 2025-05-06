package com.isai.demoecommerce.app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detail_order")
@ToString(exclude = {"order", "product"})
public class DetailOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDetailOrder;

    private String detailOrderName;

    private Double quantity;

    private Double unitPrice;

    private Double totalPrice;

    @OneToOne
    private Order order;

    @ManyToOne
    private Product product;

}
