package com.isai.demoecommerce.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@ToString(exclude = {"products", "orders"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String lastName;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String emailUser;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String address;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String phone;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String typeUser;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String passwordUser;

    @OneToMany(mappedBy = "user")
    private List<Product> products;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

}
