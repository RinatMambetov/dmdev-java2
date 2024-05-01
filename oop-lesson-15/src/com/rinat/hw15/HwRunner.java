package com.rinat.hw15;

public class HwRunner {
    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(6, 2);
        double distance1 = point1.distance(point2);
        System.out.println(distance1);

        Rectangle rectangle1 = new Rectangle(point1, point2);
        System.out.println(rectangle1);
        System.out.println(rectangle1.diagonal());
        System.out.println(rectangle1.area());

        Point point3 = new Point(6, 8);
        Point point4 = new Point(9, 5);
        Figure rectangle2 = new Rectangle(point3, point4);
        System.out.println(rectangle1.isAreaEqual(rectangle2));

        Circle circle1 = new Circle(point1, 5);
        System.out.println(circle1);
        System.out.println(circle1.perimeter());
        System.out.println(circle1.area());
        System.out.println(circle1.semiPerimeter());

        Triangle triangle1 = new Triangle(point2, point3, point4);
        System.out.println(triangle1);
        System.out.println(triangle1.area());
        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.height());

        System.out.println(ShapeUtils.isRectangle(rectangle1));
        System.out.println(ShapeUtils.isRectangle(circle1));
        System.out.println(ShapeUtils.isTriangle(triangle1));
    }
}
