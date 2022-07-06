package yandex.sprint2.task14;

class Car {
    double maxSpeed; // максимальная скорость
    float acceleration; // ускорение
    int score; // количество очков
    double kilometersTravelled; // количество пройденных километров
    Integer nitroLevel; // уровень закиси азота

    public Car(double maxSpeed, float acceleration, int score, Integer nitroLevel) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.score = score;
        this.nitroLevel = nitroLevel;
    }
}
