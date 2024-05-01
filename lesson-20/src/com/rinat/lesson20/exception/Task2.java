package com.rinat.lesson20.exception;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
