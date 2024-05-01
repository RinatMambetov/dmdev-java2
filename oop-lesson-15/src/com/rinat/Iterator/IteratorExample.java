package com.rinat.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);//неизменяемый лист
        List<Integer> list = new ArrayList<>(sourceList);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.print(next);
        }
        System.out.println();

        for (Iterator<Integer> iterator2 = list.iterator(); iterator2.hasNext(); ) {
            Integer next = iterator2.next();
            if (next == 3 || next == 4) {
                iterator2.remove();
            }
        }
        System.out.print(list);
        System.out.println();

        list.forEach(System.out::print);
    }
}
