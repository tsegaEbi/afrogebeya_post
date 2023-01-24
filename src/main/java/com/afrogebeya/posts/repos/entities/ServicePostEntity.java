package com.afrogebeya.posts.repos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="service_post_tbl")
public class ServicePostEntity extends AbstractPostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer subCategory;
}
