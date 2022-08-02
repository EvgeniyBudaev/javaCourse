package yandex.sprint4.task3;

// импортируйте нужные пакеты

import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        // цикл for для поиска задач
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                System.out.println(task.getDescription());
            }
        }
    }
}