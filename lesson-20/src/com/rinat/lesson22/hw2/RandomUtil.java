package com.rinat.lesson22.hw2;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public final class RandomUtil {
    private final static int DEFAULT_BOUND = 1000;
    private final static Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getRandomValue() {
        return getRandomValue(DEFAULT_BOUND);
    }

    public static int getRandomValue(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static List<String> generateDigits(int limit) {
        return IntStream.iterate(0, value -> value + 1)
                .limit(limit)
                .map(it -> getRandomValue())
                .mapToObj(String::valueOf)
                .collect(toList());
    }

}
