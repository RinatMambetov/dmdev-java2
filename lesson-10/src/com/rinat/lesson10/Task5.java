package com.rinat.lesson10;

import java.util.Arrays;

/**
 * 5.Написать функцию, разбивающую строку на равные части по n символов и
 * сохраняющую отдельные части в массив. Вывести этот массив.
 */
public class Task5 {
    public static void main(String[] args) {
        String value = "1234567890";
        int n = 3;
        System.out.println(Arrays.toString(split(value, n)));
    }

    private static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int index = 0;
        for (int i = 0; i < value.length(); i += n) {
            int rightIndex = Math.min(i + n, value.length());
            result[index] = value.substring(i, rightIndex);
            index++;
        }
        return result;
    }
}
