package com.example.nosqltest.service;

import com.example.nosqltest.model.Cast;
import com.example.nosqltest.model.Movie;
import com.example.nosqltest.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CastService castService;

    public Movie add(Movie movie) {
        Cast cast = castService.save(movie.getCast());
        movie.setCast(cast);
        return movieRepository.save(movie);
        //TODO: de aflat care este diferenta dintre insert si save
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
