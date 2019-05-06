package com.example.exemplu2.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // face maparea, pune si campul age in baza de date, in tabela Person
public class ParentEntity {
    private int age;
}
