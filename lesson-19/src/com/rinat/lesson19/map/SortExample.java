package com.rinat.lesson19.map;

import com.rinat.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "143", "789", "456");
        Collections.sort(strings);
        System.out.println(strings);

        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(3, "Petr", "Petrov");
        Person person3 = new Person(2, "Sveta", "Avetova");
        List<Person> persons = Arrays.asList(person1, person2, person3);
        Collections.sort(persons);
        System.out.println(persons);

        persons.sort(new CompareByFirstName());
        System.out.println(persons);

        persons.sort(Comparator.comparing(Person::getSecondName));
        System.out.println(persons);

        persons.sort(Comparator.comparing(Person::getSecondName).thenComparing(Person::getId));
        System.out.println(persons);
    }

    private static class CompareByFirstName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
