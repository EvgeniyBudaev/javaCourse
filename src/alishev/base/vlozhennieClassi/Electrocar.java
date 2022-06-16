package alishev.base.vlozhennieClassi;

public class Electrocar {
    private int id;
    private static int count;

    // Вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting...");
        }
    }

    // Статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging..." + count);
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int procent = 100;
        // Вложенный класс в методе
        class SomeClass {
            public void someMethod() {
                /* Только к константам мы можем получать доступ в методе вложенного класса
                 и к приватным переменным класса */
                System.out.println(procent + id);
            }
        }

        SomeClass someClass = new SomeClass();
        test(someClass);

        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {}
}
