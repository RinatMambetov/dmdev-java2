package com.rinat.lesson21;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Stream.of(
                        new Student(12, "Ivan"),
                        new Student(13, "Dima"),
                        new Student(11, "Sveta"),
                        new Student(14, "Misha"),
                        new Student(16, "Lesha"),
                        new Student(15, "Olga"),
                        new Student(17, "Sasha")
                )
                .parallel()
//                .sequential()
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);

        Optional<Student> maybeStudent1 = Stream.of(
                        new Student(12, "Ivan"),
                        new Student(13, "Dima"),
                        new Student(11, "Sveta"),
                        new Student(14, "Misha"),
                        new Student(16, "Lesha"),
                        new Student(15, "Olga"),
                        new Student(17, "Sasha")
                )
                .filter(student -> student.getAge() < 14)
                .reduce(((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2));

        Optional<Integer> maybeStudent2 = Stream.of(
                        new Student(12, "Ivan"),
                        new Student(13, "Dima"),
                        new Student(11, "Sveta"),
                        new Student(14, "Misha"),
                        new Student(16, "Lesha"),
                        new Student(15, "Olga"),
                        new Student(17, "Sasha")
                )
                .flatMap(student -> student.getMarks().stream())
                .reduce((mark1, mark2) -> mark1 - mark2);

        maybeStudent1.ifPresent(System.out::println);
//        System.out.println(maybeStudent);

//        maybeStudent2.ifPresent(System.out::println);

        maybeStudent1.map(Student::getAge)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);

    }
}
