package programaniya.Comparable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(list);
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
        // Variant 1
        //  if (this.id == anotherEmp.id) {
            // return 0;
        // } else if (this.id < anotherEmp.id) {
            // return -1;
        // } else {
            // return 1;
        //
        // }
        // Variant 2
        // return this.id.compareTo(anotherEmp.id);
        // Variant 3
        // return this.id - anotherEmp.id;
        // Сначала сортировка по имени. Если имена совпадают, то сортируем по фамилии
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
