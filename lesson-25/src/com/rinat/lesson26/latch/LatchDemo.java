package com.rinat.lesson26.latch;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Основная идея CountDownLatch заключается в том, что он инициализируется с определенным начальным значением
 * счетчика. Потоки, которые должны ожидать завершения работы других потоков, вызывают метод await() на объекте
 * CountDownLatch. Этот метод блокирует поток до тех пор, пока счетчик не достигнет нуля. В то же время, другие
 * потоки могут вызывать метод countDown() на объекте CountDownLatch для уменьшения счетчика на единицу. Когда
 * счетчик достигает нуля, все потоки, ожидающие на await(), разблокируются и продолжают выполнение.
 */
public class LatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(RocketDetail.values().length);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Rocket(countDownLatch));

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail, countDownLatch))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
