package programaniya.Files.Serialization.Programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String department;
    int age;
    double salary;
    Car car;

    public Employee(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
