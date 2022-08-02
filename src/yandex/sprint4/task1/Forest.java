package yandex.sprint4.task1;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        setSeason(season);
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        Forest.season = newSeason;
        if (newSeason.equals("зима")) {
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}