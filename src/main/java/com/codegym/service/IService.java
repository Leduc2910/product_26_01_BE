package com.codegym.service;

import java.util.List;
import java.util.Optional;

public interface IService<E> {
    void save(E e);
    void delete(Long id);
    List<E> findAll();
    Optional<E> findEById(Long id);
    List<E> findByName(String name);
    List<E> findByPrice(int min, int max);
    List<E> findByCategory(Long id);

}
