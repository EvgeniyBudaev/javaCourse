package yandex.sprint3.task8;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        // исправьте метод для ускорения при автопилоте
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    // переопределите метод для торможения
    @Override
    public void brake() {
        if (speed > 0) {
            if ((speed - brakingSpeed) <= 0) {
                speed = 0;
            } else {
                speed -= brakingSpeed;
            }
        } else {
            speed = 0;
        }
    }
}
