package yandex.sprint2.task14;

class CarProperties {
    String maxSpeed; // максимальная скорость
    byte initialScore; // начальное количество очков
    double acceleration; // ускорение
    int nitroLevel; // уровень закиси азота

    public CarProperties(String maxSpeed, float acceleration, int nitroLevel) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.nitroLevel = nitroLevel;
    }
}
