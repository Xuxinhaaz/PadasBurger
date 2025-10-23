package com.PadasBuger.Api.Domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.StandardException;

import java.util.Set;
import java.util.UUID;

@Table(name = "\"order\"")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    @ManyToMany(mappedBy = "products")
    private Set<Order> orders;
}
