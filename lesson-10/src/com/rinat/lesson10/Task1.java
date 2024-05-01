package com.rinat.lesson10;

/**
 * 1.Заменить все грустные смайлы :) в строке на весёлые :)
 */
public class Task1 {
    public static void main(String[] args) {
        String value = "test :) test :( test :( test :) test";
        String result = replace(value);
        System.out.println(result);
    }

    private static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
