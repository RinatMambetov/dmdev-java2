package com.rinat.lesson21.tasks;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> persons1 = List.of(
                new Person("Ivan", "Ivanov", 19),
                new Person("Dima", "Dimov", 20),
                new Person("Petr", "Petrov", 21),
                new Person("Sveta", "Svetova", 19),
                new Person("Olga", "Olgova", 20),
                new Person("Nina", "Ninova", 24),
                new Person("Dasha", "Dadashova", 25)
        );
        persons1.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        //сгруппировали по возрасту
        Map<Integer, List<String>> collect1 = persons1.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(collect1);

        //создали мап по возрасту
        List<Person> persons2 = List.of(
                new Person("Ivan", "Ivanov", 19),
                new Person("Dima", "Dimov", 20),
                new Person("Petr", "Petrov", 21),
                new Person("Sveta", "Svetova", 22),
                new Person("Olga", "Olgova", 23),
                new Person("Nina", "Ninova", 24),
                new Person("Dasha", "Dadashova", 25)
        );
        Map<Integer, Person> collect2 = persons2.stream()
//                .collect(toMap(Person::getAge, person -> person));
                .collect(toMap(Person::getAge, Function.identity()));
        System.out.println(collect2);

    }
}
