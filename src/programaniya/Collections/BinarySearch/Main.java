package programaniya.Collections.BinarySearch;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        Collections.sort(list);
        System.out.println(list); // [-8, -3, 0, 1, 5, 8, 10, 12]
        int indexElement = Collections.binarySearch(list, 0);
        System.out.println(indexElement); // 2

        Employee emp1 = new Employee(100, "Dmitriy", 25000);
        Employee emp2 = new Employee(1, "Olga", 65000);
        Employee emp3 = new Employee(45, "Elena", 100000);
        Employee emp4 = new Employee(38, "Oleg", 75000);
        Employee emp5 = new Employee(1, "Andrey", 55000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        Collections.sort(employeeList);
        // [Employee{id=1, name='Andrey', salary=55000}, Employee{id=1, name='Olga', salary=65000},
        // Employee{id=38, name='Oleg', salary=75000}, Employee{id=45, name='Elena', salary=100000},
        // Employee{id=100, name='Dmitriy', salary=25000}]
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(1, "Olga", 65000));
        System.out.println(index2);  // 1

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150};
        System.out.println(Arrays.toString(array)); // [-3, 8, 12, -8, 0, 5, 10, 1, 150]
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [-8, -3, 0, 1, 5, 8, 10, 12, 150]
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3); // 8

        Collections.reverse(list);
        System.out.println(list); // [12, 10, 8, 5, 1, 0, -3, -8]

        Collections.shuffle(list); // shuffle - перемешивает как попало
        System.out.println(list); // [0, -3, -8, 8, 5, 10, 1, 12]
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
