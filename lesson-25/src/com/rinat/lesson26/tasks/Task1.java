package com.rinat.lesson26.tasks;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 1. Написать программу, бесконечно считывающую
 * пользовательские числа из консоли.
 * Эти числа представляют собой количество секунд.
 * При каждом вводе числа, должна создаваться задача,
 * которая засыпает на введённое число секунд и затем
 * выводит "Я спал N секунд".
 * Однако нужно сделать так, чтобы все задачи выполнялись в
 * одном и том же потоке в порядке ввода.
 * Т.е. в программе есть 2 потока: главный и поток для
 * выполнения всех задач по очереди.
 * При вводе отрицательного числа программа должна завершать свою работу.
 * Второе решение - несколько потоков в пуле. Посчитать кол-во
 * обработанных задач каждым потоком
 */

/**
 * Основная идея ThreadLocal заключается в том, что он позволяет изолировать данные, которые должны быть уникальными
 * для каждого потока, от других потоков. Это особенно полезно в многопоточных приложениях, где данные, связанные с
 * конкретным потоком, должны быть изолированы от данных других потоков.
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            executorService.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.println(String.format("thread %s made %d tasks", Thread.currentThread().getName(),
                        threadLocal.get()));

                Thread.sleep(seconds * 1000);
                System.out.println(String.format("thread %s slept %d seconds", Thread.currentThread().getName(),
                        seconds));
                return seconds;
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(10L, TimeUnit.MINUTES);
    }
}
