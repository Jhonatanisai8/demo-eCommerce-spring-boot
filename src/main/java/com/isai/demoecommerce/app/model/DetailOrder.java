package com.isai.demoecommerce.app.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "detail_order")
@ToString
public class DetailOrder {
    private Integer idDetailOrder;
    private String detailOrderName;
    private Double quantity;
    private Double unitPrice;
    private Double totalPrice;

}
