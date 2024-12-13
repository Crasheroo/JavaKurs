package Rekurencja;

public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.addIterative(8);
        tree.addIterative(3);
        tree.addIterative(10);
        tree.addIterative(1);
        tree.addIterative(6);
        tree.addIterative(4);
        tree.addIterative(7);
        tree.addIterative(13);

        tree.print();
        int search = 4;

        if (tree.containsValue(search)) {
            System.out.println("Znaleziono wartosc: " + search);
        } else {
            System.out.println("Nienaleziono wartosci: " + search);
        }
    }
}
