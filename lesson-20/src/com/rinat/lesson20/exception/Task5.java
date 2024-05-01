package com.rinat.lesson20.exception;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {
    public static void main(String[] args) {
        try {
            testUnsafe();
        } catch (RinatException e) {
            System.out.println("catch in main");
            e.printStackTrace();
        }
    }

    private static void testUnsafe() throws RinatException {
        try {
            unsafe();
        } catch (Exception e) {
            System.out.println("catch in test");
            throw new RinatException(e);
        }
    }

    private static void unsafe() {
        throw new IllegalArgumentException("from unsafe");
    }
}
