package com.rinat.lesson26.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();

//        Executors.newWorkStealingPool();

        ExecutorService threadPool1 = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool1.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("it's callable");
            return 1;
        });
        System.out.println("result " + future.get());
        threadPool1.shutdown();
        threadPool1.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("newFixedThreadPool end");

        ScheduledExecutorService threadPool2 = Executors.newScheduledThreadPool(3);
        threadPool2.scheduleAtFixedRate(() -> System.out.println("ok"), 2L, 1L, TimeUnit.SECONDS);
    }
}
