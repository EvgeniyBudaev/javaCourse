package javaRushUniversity.javaSyntax.level19.lesson00.task2;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //напишите тут ваш код
        Node node1 = first.next;

        for (int i = 0; i != index; i++) {
            node1 = node1.next;
            if (node1 == null) {
                return null;
            }
        }
        return node1.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
