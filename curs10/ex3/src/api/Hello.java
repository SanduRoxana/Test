package api;

import imp.HelloEs;

public interface Hello { // cere ce ai nevoie sa faci cu implementarea // cere concretizari diferite - nu ma intereseaza implementarea din spate
                        // se numeste contractul implementarii

    public String hello(String name);

    public static Hello build() { // este metoda care construieste ceva => doar interfata trebuie modificata
        return new HelloEs();
    }
}
