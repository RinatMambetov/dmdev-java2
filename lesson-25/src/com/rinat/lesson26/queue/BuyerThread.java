package com.rinat.lesson26.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {
    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = this.cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " using in " + cashbox);

            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " freeing " + cashbox);

            cashboxes.add(cashbox);
            System.out.println(Thread.currentThread().getName() + " is over");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
