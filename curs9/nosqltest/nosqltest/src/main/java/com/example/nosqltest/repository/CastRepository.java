package com.example.nosqltest.repository;

import com.example.nosqltest.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CastRepository extends MongoRepository<Cast, String> {
}
