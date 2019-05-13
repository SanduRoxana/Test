package com.example.nosqltest.repository;

import com.example.nosqltest.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> { // aceste repository sunt generice
}
