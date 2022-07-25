package javaRushUniversity.javaSyntax.level14.lesson02.task1; // task11.task1107;

/*
Двигатель — сердце автомобиля
*/

/* Двигатель — сложный механизм, для описания которого недостаточно обычной переменной. В классе Car создай внутренний
класс (inner class) Engine. В классе Engine создай boolean поле isRunning, которое принимает значение true, если
двигатель запущен, и false в противном случае. Также в этот класс добавь методы start и stop, которые будут
запускать/останавливать двигатель (устанавливать соответствующее значение полю isRunning). Чтобы использовать двигатель,
создай поле engine типа Engine в классе Car. */

public class Car {
    //напишите тут ваш код
    Engine engine = new Engine();

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
