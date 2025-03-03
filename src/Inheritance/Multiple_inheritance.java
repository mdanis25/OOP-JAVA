package Inheritance;

interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects");
    }

    public  void fly() {
        System.out.println("Bat can fly");
    }
}

interface Add {
    int add(int a, int b);
}

interface Sub{
    int sub(int a, int b);
}

interface Mult{
    int mult(int a, int b);
}

class  Calculate implements Add, Sub, Mult {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public  int sub(int a, int b) {
        return a - b;
    }

    @Override
    public  int mult(int a, int b) {
        return a * b;
    }

}

public class Multiple_inheritance {
    public static void main(String[] args) {
        /*
        Bat bat = new Bat(); // Creating an object of Bat
        bat.eat(); // Calls eat() from Animal interface
        bat.fly(); // Calls fly() from Bird interface
         */

        Calculate calculate = new Calculate();
        System.out.println(calculate.add(3,5) + "\n" + calculate.sub(10, 3) + "\n" + calculate.mult(5, 5));
    }
}



