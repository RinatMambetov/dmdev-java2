package com.rinat.lesson19.map;

import com.rinat.lesson19.person.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(22, "Petr", "Petrov");
        Person person3 = new Person(3, "Sveta", "Svetova");
        Person person4 = new Person(44, "Sveta1", "Svetova1");
        Person person5 = new Person(5, "Sveta2", "Svetova2");
        Person person6 = new Person(66, "Sveta3", "Svetova3");

//        Map<Integer, Person> map = new HashMap<>();
        Map<Integer, Person> map = new TreeMap<>();
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        map.put(person3.getId(), person3);
        map.put(person4.getId(), person4);
        map.put(person5.getId(), person5);
        map.put(person6.getId(), person6);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
