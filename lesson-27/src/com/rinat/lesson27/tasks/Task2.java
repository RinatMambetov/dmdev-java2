package com.rinat.lesson27.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Написать программу, выполняющую поиск в строке
 * шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class Task2 {
    public static void main(String[] args) {
        String input = "test 0x12 test 0X12 test 0xff test 0XAB test 1xAG test";
        String regex = "0[xX][0-9a-fA-F]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
