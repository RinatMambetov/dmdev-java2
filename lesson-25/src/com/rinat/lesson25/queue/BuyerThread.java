package com.rinat.lesson25.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {
    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (cashboxes) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " using in " + cashbox);

//                        Thread.sleep(1L);
                        cashboxes.wait(1);

                        System.out.println(Thread.currentThread().getName() + " freeing " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();

                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " waiting cashbox");
//                        Thread.sleep(1L);
                        cashboxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
