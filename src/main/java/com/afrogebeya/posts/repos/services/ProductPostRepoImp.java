package com.afrogebeya.posts.repos.services;

import com.afrogebeya.posts.repos.entities.ProductPostEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductPostRepoImp implements ProductPostRepo{
    @Override
    public <S extends ProductPostEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ProductPostEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ProductPostEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ProductPostEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ProductPostEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ProductPostEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ProductPostEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
