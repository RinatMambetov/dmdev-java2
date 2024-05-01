package com.rinat.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

//        for (String string : strings) {
//            String value = string + string;
//            int intValue = Integer.parseInt(value);
//            if (intValue % 2 == 0) {
//                System.out.println(intValue);
//            }
//        }

        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::parseInt)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
//                .forEach(System.out::println);
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::print)
                .collect(Collectors.toList());

        System.out.println();
        IntStream.range(1, 10)
                .forEach(System.out::print);

        System.out.println();
        IntStream.iterate(0, x -> x + 1)
                .skip(10)
                .limit(15)
                .forEach(System.out::print);
    }
}
