package com.rinat.lesson24;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        long epochMilli = now.toInstant().toEpochMilli();
        System.out.println(epochMilli);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime truncated = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(truncated);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }
}
