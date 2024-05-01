package com.rinat.lesson20.exception;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (RinatException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    private static void unsafe() throws RinatException {
//        throw new RinatException("rinat throw exception");
        throw new RinatException(new RuntimeException("new runtime exception"));
    }
}
