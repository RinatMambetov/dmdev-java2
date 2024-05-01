package com.rinat.lesson25.volatil;

public class VolatileDemo {
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread flagIsFalse = new Thread(() -> {
            while (!flag) {
                System.out.println("flag is false");
            }
        });
        flagIsFalse.start();

        Thread.sleep(1);

        Thread flagIsTrue = new Thread(() -> {
            flag = true;
            System.out.println("flag is true");
        });
        flagIsTrue.start();
    }
}
