package com.example.nosqltest.controller;

import com.example.nosqltest.model.Movie;
import com.example.nosqltest.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Controller + ResponseBody // returnam un obiect
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping(path = "/")
    public Movie add(@RequestBody  Movie movie) {
        return movieService.add(movie);
    }

    @GetMapping(path = "/")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    //TODO:
}
