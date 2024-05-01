package com.rinat.lesson21.tasks;

import java.util.Map;

/**
 * 3. Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7
 * символов.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "strin1", 1,
                "string2", 2,
                "strin3", 3,
                "string4", 4,
                "strin5", 5,
                "string6", 6
        );
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
