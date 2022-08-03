package yandex.sprint4.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        List<MediaItem> mediaItems = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            // Считайте команду, введенную пользователем
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите название фильма:");
                String title = scanner.next();
                System.out.println("Введите длительность фильма в минутах:");
                int runtime = scanner.nextInt();

                // На основе введенных пользователем значений создайте объект класса Movie
                Movie movie = new Movie(title, runtime);
                mediaItems.add(movie);
            } else if (command == 2) {
                System.out.println("Введите название сериала:");
                String title = scanner.next();
                System.out.println("Введите количество серий:");
                int seriesCount = scanner.nextInt();
                System.out.println("Введите среднюю длительность серии в минутах");
                int runtime = scanner.nextInt();

                // Создайте сериал и добавьте его в список просмотренных
                Series series = new Series(title, runtime, seriesCount);
                mediaItems.add(series);
            } else if (command == 0) {
                printMediaItemsList(mediaItems);

                double totalRuntime = Calculator.calculate(mediaItems);
                System.out.println("Всего вы потратили на просмотр фильмов и сериалов, в днях: " + totalRuntime);
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Добавить фильм");
        System.out.println("2 - Добавить сериал");
        System.out.println("0 - Посчитать суммарное время и выйти");
    }


    public static void printMediaItemsList(List<MediaItem> mediaItems) {
        System.out.println("Вы посмотрели фильмов и сериалов: " + mediaItems.size());
        // Допишите вывод названий всех просмотренных фильмов и сериалов
        for (MediaItem mediaItem: mediaItems) {
            System.out.println(mediaItem.getTitle());
        }
    }

}