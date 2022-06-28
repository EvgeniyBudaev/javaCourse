package programaniya.Classes.AnonymousInnerClass;

public class Main {
    private int x = 5;
    public static void main(String[] args) {
        /* 1) Anonymous класс не имеет имени
        * 2) Anonymous класс - это "объявление" класса и одновременно создание объекта
        * 3) В анонимных классах невозможно написать конструктор
        * 4) Анонимный класс может обращаться даже к private элементам внешнего класса
        * 5) Lambda expression - это краткая форма для написания анонимных классов */
        Math m = new Math() {
            int c = 10;
            void method() {}
            @Override
            public int doOperation(int a, int b) {
                Main m = new Main();
                return a + b + m.x;
            }
        };

        System.out.println(m.doOperation(2, 3));
    }
}

interface Math {
    int doOperation(int a, int b);
}
