package yandex.sprint3.task1;

public class SpeedConverter {
    private int metersInKilometer = 1000;
    private int minutesInHour = 60;
    private double speed;

    public SpeedConverter(double speedInKmH) {
        speed = speedInKmH;
    }

    public double getSpeedInMs() {
        return (speed * metersInKilometer) / minutesInHour;
    }
}
