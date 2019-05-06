package com.example.exemplu3.service;

import com.example.exemplu3.entities.Person;
import com.example.exemplu3.repository.JobRepository;
import com.example.exemplu3.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final JobRepository jobRepository;
    private final PersonRepository personRepository;

    @Autowired
    public MyService(JobRepository jobRepository, PersonRepository personRepository) {
        this.jobRepository = jobRepository;
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }
}
