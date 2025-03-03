package Abstraction;


abstract  class Shape {
    protected double length, width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }
    abstract  double area();
}


class Circle extends  Shape {
    public Circle(double r) {
        super(r, r);
    }
    @Override
    public  double area() {
        return Math.PI * length * length;
    }
}


class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public  double area() {
        return  length * width;
    }
}

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.2d);
        System.out.println(circle.area());
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.area());
    }
}
