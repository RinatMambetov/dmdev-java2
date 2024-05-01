package com.rinat.lesson10;

/**
 * 2. Написать программу, преобразующую строку, содержащую число в
 * римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
 * идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class Hw2 {
    public static void main(String[] args) {
        String value1 = "XXIV";
        System.out.println(convertToArabic(value1));
        String value2 = "CM";
        System.out.println(convertToArabic(value2));
    }

    private static int convertToArabic(String value) {
        int prevNum = getArabic(value.charAt(value.length() - 1));
        int result = prevNum;
        for (int i = value.length() - 2; i >= 0; i--) {
            int curNum = getArabic(value.charAt(i));
            result += curNum < prevNum ? -curNum : curNum;
            prevNum = curNum;
        }
        return result;
    }

    private static int getArabic(char ch) {
        return switch (ch) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
