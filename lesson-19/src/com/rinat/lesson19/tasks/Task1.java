package com.rinat.lesson19.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Написать метод, который принимает целочисленный список и возвращает
 * целочисленный список только с нечетными значениями.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 5, 7, 89, 90);
        System.out.println(removeEven(integers));
    }

    private static List<Integer> removeEven(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                result.add(integer);
            }
        }
        return result;
    }
}
