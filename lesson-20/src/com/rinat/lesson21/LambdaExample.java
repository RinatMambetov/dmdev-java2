package com.rinat.lesson21;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
//        IntegerComparator comparator = new IntegerComparator();
//        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(10, 100));

//        Function
//        Predicate
//        Supplier
//        Consumer
//        BiConsumer
//        BiFunction
    }

//    private static class IntegerComparator implements Comparator<Integer> {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
//    }
}
