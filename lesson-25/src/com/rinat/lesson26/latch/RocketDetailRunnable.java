package com.rinat.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable {
    private final RocketDetail detail;
    private final CountDownLatch latch;

    public RocketDetailRunnable(RocketDetail detail, CountDownLatch latch) {
        this.detail = detail;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("detail preparing " + detail);
        try {
            Thread.sleep(1000L);
            System.out.println("detail finished " + detail);
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
