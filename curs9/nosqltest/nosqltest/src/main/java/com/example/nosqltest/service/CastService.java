package com.example.nosqltest.service;

import com.example.nosqltest.model.Cast;
import com.example.nosqltest.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;

    public Cast save(Cast cast) {
        return castRepository.save(cast);
    }
}
