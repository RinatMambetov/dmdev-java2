package com.rinat.lesson28.model;

public class Person {
    private Long id;

    public Person(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public long getId() {
        return id;
    }
}
