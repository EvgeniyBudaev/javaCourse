package yandex.sprint3.task6;

class Transport {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;
    protected int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}
