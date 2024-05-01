package com.rinat.lesson10;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "123 test test 123";
        String word = "123";
        System.out.println(isStartAndEnd(value, word));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
