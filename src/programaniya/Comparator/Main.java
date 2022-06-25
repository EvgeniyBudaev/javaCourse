package programaniya.Comparator;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Evgeniy", "Budaev", 100);
        Employee emp2 = new Employee(25, "Petr", "Petrov", 300);
        Employee emp3 = new Employee(350, "Ivan", "Weeks", 200);
        Employee emp4 = new Employee(350, "Ivan", "Ivanov", 200);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting: " + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sorting: " + list);
    }
}

class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
         } else if (this.id < anotherEmp.id) {
            return -1;
         } else {
            return 1;
         }
    }
}

class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
         } else if (emp1.id < emp2.id) {
            return -1;
         } else {
            return 1;
         }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary-emp2.salary;
    }
}
