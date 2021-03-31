package com.codegym.sevice;

import java.util.List;

public interface BlogService<T> {

    List<T> findAll();

    T findById(Long id);

    T save(T obj);
}
