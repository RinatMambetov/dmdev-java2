package com.rinat.lesson10;

public class Task6 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String value1 = "";
        for (int i = 0; i < 100_000; i++) {
            value1 += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
        long start2 = System.currentTimeMillis();
        StringBuilder value2 = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            value2.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
