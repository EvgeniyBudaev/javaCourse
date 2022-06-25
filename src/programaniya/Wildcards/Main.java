package programaniya.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        showListInfo(list1);

        List<String> list2= new ArrayList<>();
        list2.add("yes");
        list2.add("no");
        showListInfo(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(3.14);
        list3.add(5.64);
        System.out.println(sum(list3));
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
