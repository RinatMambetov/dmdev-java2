package com.rinat.lesson25.task;

import java.util.Queue;

public class ConsumerThread implements Runnable {
    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". size: " + list.size());
                } else {
                    System.out.println("consumer waiting. list is empty");
                }
                try {
                    int waitTime = 30;
                    System.out.println("consumer waiting " + waitTime);
                    list.wait(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
