package programaniya.Classes.LocalInnerClasses;

public class Main {
    public static void main(String[] args) {
        /* 1) Local inner класс распологается в блоках кода таких, как, например, метод или конструктор.
        * 2) Local inner класс не может быть static
        * 3) Область видимости local inner класса - это блок, в котором он находится
        * 4) Local inner класс может обращаться даже к private элементам внешнего класса
        * 5) Local inner класс может обращаться к элементам блока, в котором он написан при условии, что они final или
        *  effectively final */
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    private int a = 10;
    public void getResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println("A: " + a);
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}
