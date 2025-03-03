package Encapsulation;

class Employee {
    private String name;
    private  int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public void employeeDetails() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("start from main");
        Employee employee = new Employee("John Dou", 25, 50000d);
        employee.employeeDetails();
        System.out.println(employee.getName());
        employee.setName("Bob");
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAge());
        employee.setSalary(700000);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
