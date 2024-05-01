package com.rinat.lesson26.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Основная идея CyclicBarrier заключается в том, что он инициализируется с определенным количеством потоков, которые
 * должны достигнуть барьера, прежде чем все потоки смогут продолжить выполнение. Потоки, которые должны ожидать
 * других потоков, вызывают метод await() на объекте CyclicBarrier. Этот метод блокирует поток до тех пор, пока не
 * все потоки не достигнут барьера. После достижения барьера, все потоки разблокируются и могут продолжить выполнение.
 * В отличие от CountDownLatch, который уменьшает счетчик на единицу и разблокирует потоки, когда счетчик достигает
 * нуля, CyclicBarrier использует счетчик для отслеживания количества потоков, которые должны достигнуть барьера.
 * После достижения барьера, счетчик сбрасывается на исходное значение, и барьер может быть использован снова.
 */
public class BarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("start" +
                "!!!"));
        ExecutorService threadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(detail -> new RocketDetailRunnable(detail, cyclicBarrier))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
