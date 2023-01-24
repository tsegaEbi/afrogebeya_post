package com.afrogebeya.posts.repos.services;

import com.afrogebeya.posts.repos.entities.ServicePostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePostRepo extends CrudRepository<ServicePostEntity,Long> {
}
