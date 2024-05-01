package com.rinat.lesson19.hw1.task1;

import java.util.LinkedList;
import java.util.List;

/**
 * 1. Написать метод markLength4, принимающий в качестве
 * параметра список (List) строк и размещающий строку "****"
 * перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****",
 * "Java", "programmer"}
 */
public class MarkLengthDemo {
    public static void main(String[] args) {
//        List<String> source = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
//        List<String> strings = new LinkedList<>(source);
        List<String> strings = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java",
                "programmer"));
        System.out.println(strings);

        MarkLengthUtil.markLength4(strings);
        System.out.println(strings);

    }
}
