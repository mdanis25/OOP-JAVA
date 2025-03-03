package Polymorphism;

class Product {
    public int multiplication(int a, int b) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public int multiplication(int x, int y, int z) {
        return x * y * z;
    }
}


class Animal {
    public  void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Barking!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow! Meow!");
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.multiplication(2, 5));
        System.out.println(product.multiplication(2.5d, 2.5d));
        System.out.println(product.multiplication(2, 5, 4));

        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }

}
