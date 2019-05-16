package main;

import model.Car;
import model.Product;

public class Main {

    public static void main(String[] args) {
        Product p = new Product.Builder()
                .setColor("red")
                .setName("beer")
                .setPrice(5)
                .build();

        Car c = new Car()  // nu respecta principuil de single responsability
                .setId(10)
                .setName("BMW");
    }
}
