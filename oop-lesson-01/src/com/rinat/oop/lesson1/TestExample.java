package com.rinat.oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 101, 200, 33};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int val : values) {
            System.out.println(val);
        }
    }

}
