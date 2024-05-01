package com.rinat.lesson19.map;

import com.rinat.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(2, "Petr", "Petrov");
        Person person3 = new Person(1, "Sveta", "Svetova");
        Map<Integer, Person> map = new HashMap<>();
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        map.putIfAbsent(person3.getId(), person3);

        System.out.println(map.get(2));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3, person3));
    }
}
