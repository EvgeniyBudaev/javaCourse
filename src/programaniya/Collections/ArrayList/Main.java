package programaniya.Collections.ArrayList;

import alishev.base.arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Car");
        arrayList1.add("Bus");
        arrayList1.add("Track");
        System.out.println(arrayList1.get(0)); // Car

        ArrayList<String> arrayList2 = new ArrayList<>(100);
        arrayList2.add("1");
        arrayList2.add("2");
        System.out.println(arrayList2.size()); // 2

        List<String> arrayList3 = new ArrayList<>();

        List<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4); // [Car, Bus, Track]
        for (String s: arrayList4) {
            System.out.println(s); // Car Bus Track
        }
        arrayList4.set(0, "Fly");
        System.out.println(arrayList4); // [Fly, Bus, Track]
        arrayList4.remove(0);
        System.out.println(arrayList4); // [Bus, Track]

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Olga"));
        students.add(new Student("Alex"));
        System.out.println(students); // [Student{name='Olga'}, Student{name='Alex'}]
        students.add(new Student("Alex"));
        students.remove(new Student("Alex"));
        System.out.println(students); // [Student{name='Olga'}, Student{name='Alex'}]
        arrayList4.addAll(0, arrayList1);
        arrayList4.clear(); // []
        System.out.println(arrayList1.indexOf("Car")); // 0
        System.out.println(arrayList1.size()); // 3
        System.out.println(arrayList1.isEmpty()); // false
        System.out.println(arrayList1.contains("Bus")); // true
        System.out.println(arrayList1.toString()); // [Car, Bus, Track]

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder[] array = {sb1, sb2 , sb3};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list); // [A, B, C]
        array[0].append('!');
        System.out.println(list); // [A!, B, C]

        ArrayList<String> text1 = new ArrayList<>();
        text1.add("A");
        text1.add("B");
        text1.add("D");
        text1.add("E");
        ArrayList<String> text2 = new ArrayList<>();
        text2.add("A");
        text2.add("B");
        text2.add("C");
        // text1.removeAll(text2);
        // System.out.println(text1); // [D, E]
        // text1.retainAll(text2);
        // System.out.println(text1); // [A, B]
        boolean result = text1.contains(text2);
        System.out.println(result); // false
        List<String> myList = text1.subList(0,2);
        System.out.println(myList); // [A, B]

        Object[] alphabets = text1.toArray();
        System.out.println(alphabets); // [Ljava.lang.Object;@3a71f4dd
        String[] al = text1.toArray(new String[0]);
        for (String s: al) {
            System.out.println(s); // A B D E
        }

        // листы не могут содержать null и их нельзя менять в примерах ниже
        List<Integer> nums = List.of(3, 8, 15);
        System.out.println(nums); // [3, 8, 15]
        // nums.add(100); // Exception

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2); // [Car, Bus, Track]
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
