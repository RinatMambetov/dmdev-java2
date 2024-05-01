package com.rinat.lesson26.tasks;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 2.Задан массив случайных целых чисел (от 1 до 300)
 * случайной длины (до 1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами:в
 * одном потоке и используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = new int[100_000_000];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(300) + 1;
        }

        trackTime(() -> findMaxParallel(values));
        
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        trackTime(() -> {
            try {
                return findMaxThreadPool(values, executorService);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            return Integer.MIN_VALUE;
        });
        executorService.shutdownNow();

        trackTime(() -> findMax(values));
    }

    private static int trackTime(Supplier<Integer> task) {
        long startTime = System.currentTimeMillis();
        int max = task.get();
        System.out.println("delta time: " + (System.currentTimeMillis() - startTime));
        return max;
    }

    private static int findMax(int[] values) {
        System.out.println("into findMax");
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxParallel(int[] values) {
        System.out.println("into findParallelMax");
        return IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxThreadPool(int[] values, ExecutorService executorService) throws ExecutionException,
            InterruptedException {
        System.out.println("into findMaxThreadPool");
        return executorService.submit(() -> IntStream.of(values)
                        .parallel()
                        .max()
                        .orElse(Integer.MIN_VALUE))
                .get();
    }
}
