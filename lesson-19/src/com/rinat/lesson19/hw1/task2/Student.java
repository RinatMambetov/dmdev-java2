package com.rinat.lesson19.hw1.task2;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageGrade;

    public Student(String name, String surname, int age, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
