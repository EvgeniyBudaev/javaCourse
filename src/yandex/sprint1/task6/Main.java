package yandex.sprint1.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balls = 15; // Сохраните общее число мячиков Пикселя в переменной balls
        System.out.println("У Пикселя " + balls + " мячиков");

        // Поиграйте с Пикселем, вызвав метод playPixel
        playPixel(balls);

        // После игры Пиксель должен вернуть все мячики на место!
        System.out.println("Пиксель вернул все мячики");
        System.out.println("Их снова " + balls);
    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячиков он спрятал?");
        int hiddenBalls = scanner.nextInt(); // Сохраните количество мячиков, которые спрятал Пиксель, в переменную hiddenBalls

        balls = balls - hiddenBalls; // Посчитайте, сколько у Пикселя осталось мячиков
        System.out.println("Осталось " + balls );
    }
}
