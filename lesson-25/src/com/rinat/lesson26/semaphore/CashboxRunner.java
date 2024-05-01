package com.rinat.lesson26.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

/**
 * Основная идея Semaphore заключается в том, что он инициализируется с определенным количеством разрешений. Потоки,
 * которые хотят получить доступ к ресурсу, вызывают метод acquire() на объекте Semaphore. Если доступно разрешение,
 * поток получает его и продолжает выполнение. Если разрешений нет, поток блокируется до тех пор, пока не станет
 * доступно разрешение. После завершения работы с ресурсом поток вызывает метод release() на объекте Semaphore,
 * освобождая одно из разрешений, чтобы другие потоки могли получить доступ к ресурсу.
 */
public class CashboxRunner {
    public static void main(String[] args) throws InterruptedException {
        Semaphore cashboxes = new Semaphore(2);
        List<Thread> threads = Stream.of(
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes),
                        new BuyerThread(cashboxes)
                )
                .map(Thread::new)
                .peek(Thread::start)
                .toList();

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
