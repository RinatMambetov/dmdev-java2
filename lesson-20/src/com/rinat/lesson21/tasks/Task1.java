package com.rinat.lesson21.tasks;

import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 6, 7, 9, 12, 35, 67, 89, 25);
        OptionalDouble average = integers.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        average.ifPresent(System.out::println);
    }
}
