package Rekurencja;

public class BinaryTree {
    private Node root;
                                    // 10
    public boolean containsValue(int value) {
        Node current = root;


        while (current != null) {
            if (value == current.getValue()) {
                return true;
            }

            if (value > current.getValue()) {
                current = current.getRight();
            }
            else if (value < current.getValue()) {
                current = current.getLeft();
            }
        }
        return false;
    }

    public void addIterative(int value) {
        Node node = new Node();
        node.setValue(value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        Node parent = null;
        while (current != null) {
            if (value > current.getValue()) {
                parent = current;
                current = current.getRight();
            }
            else if (value < current.getValue()) {
                parent = current;
                current = current.getLeft();
            }
        }

        if (value > parent.getValue()) {
            parent.setRight(node);
        } else if (value < parent.getValue()) {
            parent.setLeft(node);
        }
    }

    public void print() {
        print(root);
    }

    public void print(Node current) {
        if (current != null) {
            print(current.getLeft());
            System.out.println(current.getValue());
            print(current.getRight());
        }
    }
}