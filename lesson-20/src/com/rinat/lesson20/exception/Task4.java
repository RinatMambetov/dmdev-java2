package com.rinat.lesson20.exception;

/**
 * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (RinatRuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void unsafe() {
        throw new RinatRuntimeException("hello from re");
    }
}
