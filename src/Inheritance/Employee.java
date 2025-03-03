package Inheritance;

class Person {
    private String name;
    private  int id;
    private float cgpa;

    public  Person(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void showDetails() {
        System.out.println("Name: " + this.name + " ID: " + this.id + " Cgpa: " + this.cgpa);
    }
}


public class Employee extends Person {
    private int salary;
    private String department;

    public Employee(String name, int id, float cgpa, int salary, String department) {
        super(name, id, cgpa);
        this.salary = salary;
        this.department = department;
    }

    public void showEmployeeDetails() {
        super.showDetails();
        System.out.print("Salary: " + this.salary + " Department: " + this.department);

    }
}