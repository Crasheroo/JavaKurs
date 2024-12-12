package Rekurencja;

public class TreeXD {
    private Node head;

    public boolean containsValue(int value) {
      Node current = head;

        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }

            if (value < current.getValue()) {
                current.getLeft();
            } else if (value > current.getValue()) {
                current.getRight();
            }
        }

        return false;
    }

    public void addNode(int value) {
        Node node = new Node();
        node.setValue(value);
        if (head == null) {
            head = node;
            return;
        }
        if (head != null) {
//            addRecursive(head, value);
            addIterative(value);
        }
    }

    private void addIterative(int value) {
        Node node = new Node();
        node.setValue(value);
        if (head == null) {
            head = node;
            return;
        }

        Node parent = null;
        Node current = head;
        while (current != null) {
            if (current.getValue() > value) {
                parent = current;
                current = current.getLeft();
            }
            else if (current.getValue() < value) {
                parent = current;
                current = current.getRight();
            }
        }

        if (value > parent.getValue()) {
            parent.setRight(node);
        } else if (value < parent.getValue()) {
            parent.setLeft(node);
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
