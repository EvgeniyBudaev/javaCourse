package programaniya.LambdaExpressions.RemoveIf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* RemoveIf - удаляет из коллекции по какому-то критерию */
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");

        al.removeIf(element -> element.length() < 5);
        System.out.println(al); // [Privet, Uchim Java]
    }
}
