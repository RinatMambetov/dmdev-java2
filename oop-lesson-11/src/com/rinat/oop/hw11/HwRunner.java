package com.rinat.oop.hw11;

public class HwRunner {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(6, 2);
        double distance1 = point1.distance(point2);
        System.out.println(distance1);

        Rectangle rectangle1 = new Rectangle(point1, point2);
        System.out.println(rectangle1.diagonal());
        System.out.println(rectangle1.area());
    }
}
