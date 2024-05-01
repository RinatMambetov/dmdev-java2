package com.rinat.lesson27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String phoneNumber1 = "+7 (495) 667-01-60";
        String phoneNumber2 = "+7(495)667-01-60";
        String phoneNumber3 = "7(495)667-01-60";
        String regex = "\\+?\\d ?\\(\\d{3}\\) ?\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(phoneNumber1);
        Matcher matcher2 = pattern.matcher(phoneNumber2);
        Matcher matcher3 = pattern.matcher(phoneNumber3);
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

        System.out.println(Pattern.matches(regex, phoneNumber1));
        System.out.println(Pattern.matches(regex, phoneNumber2));
        System.out.println(Pattern.matches(regex, phoneNumber3));

        System.out.println(phoneNumber1.matches(regex));
        System.out.println(phoneNumber2.matches(regex));
        System.out.println(phoneNumber3.matches(regex));
    }
}
