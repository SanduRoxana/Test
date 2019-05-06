package com.example.exemplu2.pk;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DogPk implements Serializable {
    private int id;
    private int age;
}
