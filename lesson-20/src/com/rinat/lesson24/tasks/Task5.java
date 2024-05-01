package com.rinat.lesson24.tasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 4. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату.Создать объект LocalDate, представляющий собой дату
 * 07.07.2018.Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prev = LocalDate.of(2018, 7, 7);

        System.out.println(prev);
        System.out.println(now);

        Period period = Period.between(prev, now);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        long between = ChronoUnit.DAYS.between(prev, now);
        System.out.println(between);

    }
}
