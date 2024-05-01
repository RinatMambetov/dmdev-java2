package com.rinat.lesson20.exception;

import java.util.Random;

/**
 * 7. Написать метод, который в 50% случаев бросает исключение.
 * Вызвать этот метод в конструкции try-catch-finally. Протестировать
 * работу блока finally.
 */
public class Task7 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("main end");
        }
    }

    private static void unsafe() throws Exception {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        if (randomNum == 1) {
            throw new Exception("not lucky");
        }
    }
}
