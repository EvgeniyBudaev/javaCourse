package alishev.base.ifElse;

public class IfElse {
    public static void main(String[] args) {
        int value = 1;

        if (value < 5) {
            System.out.println("value меньше 5");
        } else if (value > 15 && value < 20) {
            System.out.println("value больше 15 и меньше 20");
        } else {
            System.out.println("value больше 20");
        }
    }
}
