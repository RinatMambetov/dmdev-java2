package com.rinat.lesson18;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list1 = new List<>(10);
        list1.add("string1");
//        list1.add(25);
        list1.add("string2");
        list1.add("string3");
//        String o1 = (String) list1.get(0);
        String s1 = list1.get(0);

        System.out.println(s1);

    }
}
