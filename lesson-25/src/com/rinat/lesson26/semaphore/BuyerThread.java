package com.rinat.lesson26.semaphore;

import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {
    private final Semaphore semaphore;

    public BuyerThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " using in some cashbox");

            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " freeing some cashbox");

            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " is over");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
