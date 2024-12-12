package Rekurencja;

public class TreeXD {
    private Node head;

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        if (head == null) {
            head = node;
        }
        if (head.getValue() > value) {
            head.setLeft(node);
        }
        if (head.getValue() < value) {
            head.setRight(node);
        }
    }

    public void print() {
        print(head);
    }

    public void print(Node current) {
        if (current != null) {
            print(current.getLeft());
            System.out.println(current.getValue());
            print(current.getRight());
        }
    }
}
