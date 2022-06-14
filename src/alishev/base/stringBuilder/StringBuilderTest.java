package alishev.base.stringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        String title = "Hello";
        title = "Java";
        System.out.println(title); // Java

        String str1 = "This";
        String str2 = "is";
        String str3 = "Java";
        String strAll = str1 + str2 + str3;
        System.out.println(strAll);

        StringBuilder sb = new StringBuilder("Hi"); // для конкатенации строк, для множества конкатенаций.
        System.out.println(sb.toString()); // Hi
        sb.append(" my").append(" friend");
        System.out.println(sb.toString()); // Hi my friend
    }
}
