package com.afrogebeya.posts.repos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="product_post_tbl")
public class ProductPostEntity extends AbstractPostEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    Integer subCategory;
}
