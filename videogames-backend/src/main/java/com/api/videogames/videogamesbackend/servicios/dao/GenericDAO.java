package com.api.videogames.videogamesbackend.servicios.dao;

import java.util.Optional;

public interface GenericDAO <T>{

    Optional<T> findById(Integer id);
    T save(T entity);
    Iterable<T> findAll();
    void deleteById(Integer id);
}
