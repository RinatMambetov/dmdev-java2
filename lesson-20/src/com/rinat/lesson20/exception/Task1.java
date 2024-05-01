package com.rinat.lesson20.exception;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (Exception e) {
            System.err.println("catch");
            e.printStackTrace();
        }
    }
}
