package com.rinat.lesson24.tasks;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 7. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 */
public class Task8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime plus42 = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(plus42);
    }
}
