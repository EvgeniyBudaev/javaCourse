package alishev.base.formatString;

public class FormatString {
    public static void main(String[] args) {
        String name = "Java";
        System.out.printf("My name is %s \n", name); // My name is Java
        System.out.printf("Count %d \n", 10); // Count 10
        System.out.printf("%f This is %s a string, %d \n", 10.4, "test", 5); // 10,400000 This is test a string, 5
        System.out.printf("String %10d \n", 532); // String        532
        System.out.printf("String %.2f \n", 45.128755); // String 45,13 с округлением
    }
}
