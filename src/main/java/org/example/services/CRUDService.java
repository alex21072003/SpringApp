package org.example.services;

import org.example.News;

import java.util.Collection;
import java.util.List;

public interface CRUDService<T> {
    T getById(int id);
    Collection<T> getAll();
    void create(T news);
    void update(int id, T t);
    void deleteById(int id);
}
