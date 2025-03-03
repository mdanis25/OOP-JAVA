package Inheritance;

interface Shape {
    double calculateArea();
}

class Circles implements  Shape {
    private double redius;
    public Circles(double redius) {
        this.redius = redius;
    }

    @Override
    public  double calculateArea() {
        return Math.PI * Math.pow(redius, 2);
    }
}
public class Main {
    public  static void main(String[] args) {
        System.out.println("starting from main class");
        Circles circle = new Circles(2.2d);
        System.out.println(circle.calculateArea());
    }
}

