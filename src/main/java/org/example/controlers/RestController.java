package org.example.controlers;

import org.example.News;
import org.example.services.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final Service service;
    public RestController(Service service){
        this.service = service;
    }
    @GetMapping(path = "/api/news/{id}")
    public News getNewsById(@PathVariable int id) {
        News news = service.getById(id);
        return news;
    }
    @GetMapping(path = "/api/news" )
    public Collection<News>getAllNews(){
        return service.getAll();
    }
    @PostMapping(path = "/api/news" )
    public ResponseEntity createNews(@RequestBody News news){
        System.out.println("Current news for create: " + news);
        service.create(news);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping(path = "/api/news/{id}" )
    public ResponseEntity updateNews(@PathVariable int id, @RequestBody News news){
        service.update(id, news);
        return new ResponseEntity(HttpStatus.OK);

    }
    @DeleteMapping(path = "/api/news/{id}")
    public ResponseEntity deleteNews(@PathVariable int id){
        service.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
