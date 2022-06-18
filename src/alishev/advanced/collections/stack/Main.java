package alishev.advanced.collections.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek()); // 1
        System.out.println(stack.pop()); // 1
        System.out.println(stack); // [5, 3]
        System.out.println(stack.empty()); // false
        System.out.println("-------");

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
