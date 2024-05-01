package com.rinat.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Ivan", "Ivanov");
        Person person2 = new Person(1, "Ivan", "Ivanov");
        Person person3 = new Person(2, "Petr", "Petrov");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
