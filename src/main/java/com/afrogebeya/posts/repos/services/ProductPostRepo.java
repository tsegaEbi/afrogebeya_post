package com.afrogebeya.posts.repos.services;

import com.afrogebeya.posts.repos.entities.ProductPostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPostRepo extends CrudRepository<ProductPostEntity,Long> {
}
