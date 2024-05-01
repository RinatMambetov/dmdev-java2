package com.rinat.lesson19.map;

import com.rinat.lesson19.person.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(2, "Petr", "Petrov");
        Person person3 = new Person(3, "Sveta", "Svetova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(person1.getId(), person1);
        map.put(person3.getId(), person3);
        map.put(person2.getId(), person2);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
