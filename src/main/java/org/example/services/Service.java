package org.example.services;

import org.example.News;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
@org.springframework.stereotype.Service
public class Service implements CRUDService<News>{
    private final TreeMap<Integer, News> listNews = new TreeMap<>();
    @Override
    public News getById(int id) {

        return listNews.get(id);
    }

    @Override
    public Collection<News> getAll() {
        return listNews.values();
    }

    @Override
    public void create(News news) {
        int nextId = listNews.isEmpty()? 1 : listNews.lastKey() + 1;
        news.setId(nextId);
        listNews.put(nextId,  news);
    }


    @Override
    public void update(int id, News news) {
        news.setId(id);
        listNews.put(id,news);

    }

    @Override
    public void deleteById(int id) {
        listNews.remove(id);

    }
}
