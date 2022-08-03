package yandex.sprint4.task10;

import java.util.List;

public class Calculator {
    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double totalTimeAtMinutes = 0.0;

        for (MediaItem mediaItem: mediaItems) {
            boolean isMovie = mediaItem instanceof Movie;
            boolean isSeriesMovie = mediaItem instanceof Series;

            if (isMovie) {
                totalTimeAtMinutes += mediaItem.getRuntime();
            }
            if (isSeriesMovie) {
                totalTimeAtMinutes = ((Series) mediaItem).getSeriesCount() * mediaItem.getRuntime();
            }
        }

        return totalTimeAtMinutes / (60 * 24);
    }

}