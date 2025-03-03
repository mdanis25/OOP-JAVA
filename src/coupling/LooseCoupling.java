package coupling;

interface Engine {
    public void  start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Enginie starting....");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine starting...");
    }
}

class Car {
    private Engine engine;
    public Car(Engine engine) {     // constructor injection
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving....");
    }
}


public class LooseCoupling {
    public static void main(String[] args) {
        Engine petrol = new PetrolEngine();
        Engine electric = new ElectricEngine();
        Car car1 = new Car((petrol));
        car1.drive();

        Car car2 = new Car(electric);
        car2.drive();
    }
}
