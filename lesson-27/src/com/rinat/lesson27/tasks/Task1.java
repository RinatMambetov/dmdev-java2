package com.rinat.lesson27.tasks;

/**
 * 1. Написать программу, проверяющую, является ли введённая
 * строка адресом почтового ящика.
 * В названии почтового ящика разрешить использование только
 * букв, цифр и нижних подчёркиваний, при этом оно должно
 * начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */
public class Task1 {
    public static void main(String[] args) {
        String mail1 = "rinat@mail.com";
        String mail2 = "Rinat@mail.org";
        String mail3 = "rinat@mail.ru";
        String mail4 = "1rinat@mail.com";
        String mail5 = "rinat@m.com";

        String regex = "[a-zA-Z]\\w*@\\w{2,}\\.(com|org)";

        System.out.println(mail1.matches(regex));
        System.out.println(mail2.matches(regex));
        System.out.println(mail3.matches(regex));
        System.out.println(mail4.matches(regex));
        System.out.println(mail5.matches(regex));
    }
}
