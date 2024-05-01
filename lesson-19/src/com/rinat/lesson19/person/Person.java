package com.rinat.lesson19.person;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String secondName;

    public Person(int id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(id, person.id);
//        if (id > person.id) {
//            return 1;
//        } else if (id < person.id) {
//            return -1;
//        } else {
//            return 0;
//        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(secondName,
                person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

}
