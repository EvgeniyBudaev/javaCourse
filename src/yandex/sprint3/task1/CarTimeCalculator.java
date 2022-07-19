package yandex.sprint3.task1;

public class CarTimeCalculator {
    private double speed = 25; // средняя скорость в км/ч
    private double speedInMS = new SpeedConverter(speed).getSpeedInMs();
    private String courierName;

    public CarTimeCalculator(String name) {
        courierName = name;
    }

    public long getDeliveryTime(int distanceInMeters) {
        if (distanceInMeters <= 0) {
            return 1;
        }
        return (int)Math.ceil(distanceInMeters / speedInMS);
    }

    public String getCourierName() {
        return courierName;
    }
}
