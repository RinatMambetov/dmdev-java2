package com.rinat.lesson25.task;

import java.util.Queue;

public class ProducerThread implements Runnable {
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    list.add(random);
                    System.out.println("producer adding value: " + random + ". size: " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
                try {
                    int waitTime = 20;
                    System.out.println("producer waiting: " + waitTime);
                    list.wait(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
