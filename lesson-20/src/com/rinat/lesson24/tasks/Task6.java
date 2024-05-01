package com.rinat.lesson24.tasks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prev = LocalDate.of(2018, 7, 7);

        LocalDateTime nowMidnight = now.atStartOfDay();
        LocalDateTime prevMidnight = prev.atStartOfDay();

        Duration between = Duration.between(prevMidnight, nowMidnight);
        System.out.println(between.getSeconds());

    }
}
