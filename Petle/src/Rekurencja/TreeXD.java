package Rekurencja;

public class TreeXD {
    private Node head;



    public void addNode(int value) {
        Node node = new Node();
        node.setValue(value);
        if (head == null) {
            head = node;
            return;
        }
        if (head != null) {
            addRecursive(head, value);
        }
    }

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            Node node = new Node();
            node.setValue(value);
            return node;
        }

        if (current.getValue() < value) {
            current.setRight(addRecursive(current.getRight(), value));
        }
        else if (current.getValue() > value) {
            current.setLeft(addRecursive(current.getLeft(), value));
        }
        return current;
    }

//    public void add(int value) {
//        Node node = new Node();
//        node.setValue(value);
//        if (head == null) {
//            head = node;
//        } else {
//            if (value < head.getValue()) {
//                if (head.getLeft() != null) {
//                    if (value < head.getLeft().getValue()) {
//
//                    }
//                } else {
//                    head.setLeft(node);
//                }
//            }
//
//            if (value > head.getValue()) {
//
//            }
//        }

//        if (value > head.getValue()) {
//            if (head.getRight() != null && head.getRight().getValue() < value) {
//                head.getRight().setRight(node);
//            } else if (head.getRight() == null) {
//                head.setRight(node);
//            }
//        }
//
//        if (value < head.getValue()) {
//            if (head.getLeft() != null && head.getLeft().getValue() > value) {
//                head.getLeft().setLeft(node);
//            } else if (head.getLeft() == null) {
//                head.setLeft(node);
//            } else if (head.getLeft().getValue() != 0) {
//                head.getLeft().setLeft(node);
//            }
//        }
//    }

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
