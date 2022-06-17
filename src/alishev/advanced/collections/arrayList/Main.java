package alishev.advanced.collections.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i*2); // добавление элемента
        }

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // получение элемента
        }

        for (Integer num: list) {
            System.out.println(num);
        }

        list.remove(5); // удаление элемента

        // Мы проводим много удалений из нашего листа
        list = new LinkedList<>();
    }
}
