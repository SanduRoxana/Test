package main;

import api.Hello;
import imp.HelloEn;

public class Person { // foloseste un contract - Hello

    private Hello hello;

    public Person() {
        this.hello = Hello.build();
    }

    public void sayHello(String name) {
        String s = hello.hello(name);
        System.out.println(s);
    }
}
