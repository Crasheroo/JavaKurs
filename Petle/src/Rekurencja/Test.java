package Rekurencja;

public class Test {
    public static void main(String[] args) {
        TreeXD tree = new TreeXD();

        tree.addNode(8);
        tree.addNode(3);
        tree.addNode(10);
        tree.addNode(1);
        tree.addNode(6);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(13);

        tree.print();
        int search = 4;


        if (tree.containsValue(search)) {
            System.out.println("Znaleziono wartosc: " + search);
        } else {
            System.out.println("Nienaleziono wartosci: " + search);
        }
    }
}
