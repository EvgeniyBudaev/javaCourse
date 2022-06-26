package programaniya.Collections.Stack;

import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("C");
        stack.push("B");
        stack.push("D");
        System.out.println(stack); // [A, C, B, D]
        System.out.println(stack.pop()); // D
        System.out.println(stack); // [A, C, B]

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
