package com.example.API_SF_Shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Categories category;

    @ManyToOne
    @JoinColumn(name="brandId")
    private Brands brand;

    private String description;

    private String productName;

    private Double productPrice;

    private Long qty;

    private Double amount;

    private String status;

    @Column(name = "limit_date")
    private Date limitDate;
}
