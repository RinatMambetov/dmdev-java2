package com.rinat.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */
public class Task6 {
    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new IllegalArgumentException("illegal argument"),
            1, new FileNotFoundException("file not found"),
            2, new RinatException("rinat exception")
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (RinatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void unsafe(int randomValue) throws Throwable {
        throw EXCEPTIONS.getOrDefault(randomValue, new Throwable("default"));
    }
}
