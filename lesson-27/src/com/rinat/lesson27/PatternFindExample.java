package com.rinat.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumbers = "test+7 (495) 667-01-60test+7 (496) 667-01-61test+7 (497) 667-01-62test+7 (498) " +
                "667-01-63test";
        String regex = "\\+?\\d ?\\((?<code>\\d{3})\\) ?(?<phone>\\d{3}-\\d{2}-\\d{2})";

        Pattern pattern = Pattern.compile(regex);

//        1
        Matcher matcher1 = pattern.matcher(phoneNumbers);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
            System.out.println(matcher1.group("code"));
            System.out.println(matcher1.group(2));
        }

//        2
        Matcher matcher2 = pattern.matcher(phoneNumbers);
        StringBuilder stringBuilder1 = new StringBuilder();
        while (matcher2.find()) {
            matcher2.appendReplacement(stringBuilder1, " xxx ");
        }
        matcher2.appendTail(stringBuilder1);
        System.out.println(stringBuilder1);

//        3
        Matcher matcher3 = pattern.matcher(phoneNumbers);
        StringBuilder stringBuilder2 = new StringBuilder();
        while (matcher3.find()) {
            matcher3.appendReplacement(stringBuilder2, " $1->$2 "); //numbers of groups
        }
        matcher3.appendTail(stringBuilder2);
        System.out.println(stringBuilder2);

//        4
        System.out.println(phoneNumbers.replaceAll(regex, " $1>>>$2 "));
    }
}
