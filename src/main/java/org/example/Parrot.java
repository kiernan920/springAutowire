package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "KOKO";

    public String getName() {
        return name;
    }

    public Parrot setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
