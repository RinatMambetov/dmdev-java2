package com.rinat.lesson10;

/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */
public class Hw1 {
    public static void main(String[] args) {
        String value = "testatset";
        System.out.println(isPalindrome(value));
    }

    private static boolean isPalindrome(String value) {
//        value = value.toLowerCase();
//        for (int i = 0, j = value.length() - 1; i < value.length() / 2; i++, j--) {
//            if (value.charAt(i) != value.charAt(j)) {
//                return false;
//            }
//        }
//        return true;
        return new StringBuilder(value).reverse().toString().equalsIgnoreCase(value);
    }
}
