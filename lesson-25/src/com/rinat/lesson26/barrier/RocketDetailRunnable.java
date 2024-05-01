package com.rinat.lesson26.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {
    private final RocketDetail detail;
    private final CyclicBarrier barrier;

    public RocketDetailRunnable(RocketDetail detail, CyclicBarrier barrier) {
        this.detail = detail;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println("detail preparing " + detail);
        try {
            Thread.sleep(1000L);
            System.out.println("detail finished " + detail);
            barrier.await();
            System.out.println("detail used " + detail);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
