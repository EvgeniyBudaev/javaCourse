package yandex.sprint7.UnitTests.task4;

/** Хранит конфигурацию фабрики по производству печенек с предсказаниями.*/
public class FortuneConfig {
    private final boolean isPositive;

    public FortuneConfig(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public boolean isPositive() {
        return isPositive;
    }
}