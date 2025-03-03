package Inheritance;

class One {
    public void oneDetails() {
        System.out.println("This is a One class");
    }
}

class Two extends One {
    public void twoDetails() {
        System.out.println("This is a class Two");
    }
}

public class Three extends Two {
    public  void threeDetails() {
        System.out.println("This is a class Three");
    }
}
