package com.rinat.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {
    private final CountDownLatch latch;

    public Rocket(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("rocket preparing to start...");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
