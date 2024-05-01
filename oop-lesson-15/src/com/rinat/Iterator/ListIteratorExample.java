package com.rinat.Iterator;

import com.rinat.lesson18.List;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list1 = new List<>(5);
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");

        for (String value : list1) {
            System.out.print(value);
        }
        System.out.println();

        list1.iterator().forEachRemaining(System.out::print);
        System.out.println();

        list1.forEach(System.out::print);
    }
}
