package com.afrogebeya.posts.repos.services;

import com.afrogebeya.posts.repos.entities.ServicePostEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicePostRepoImp implements ServicePostRepo{
    @Override
    public <S extends ServicePostEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ServicePostEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ServicePostEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ServicePostEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ServicePostEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(ServicePostEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ServicePostEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
