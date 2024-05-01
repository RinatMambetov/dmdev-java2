package com.rinat.lesson19.hw1.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 2. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 15, 4.1);
        Student student2 = new Student("Ivan", "Petrov", 16, 4.2);
        Student student3 = new Student("Petr", "Petrov", 14, 4.0);
        Student student4 = new Student("Dima", "Ivanov", 17, 4.4);
        Student student5 = new Student("Dima", "Dimov", 18, 4.3);

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
//        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Student maxGrade = new Student("", "", 0, 0);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.getAverageGrade() > maxGrade.getAverageGrade()) {
                maxGrade = next;
            }
        }
        System.out.println(maxGrade);
        System.out.println();

        students.forEach(System.out::println);
        System.out.println();

//        students.sort(Comparator.comparing(Student::getFullName));
//        students.forEach(System.out::println);
//        System.out.println();

//        students.sort(Comparator.comparing(Student::getAge));
        students.sort(new StudentAgeComparator());
        students.forEach(System.out::println);
        System.out.println();

        students.sort(Comparator.comparing(Student::getAverageGrade));
        students.forEach(System.out::println);
        System.out.println();

        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getSurname));
        students.forEach(System.out::println);
        System.out.println();
    }
}
