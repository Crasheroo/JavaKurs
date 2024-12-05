package Zadanie_Trzy;

public class Stack<T> {
    private Node<T> head;
    private int size;

    public void push(T value) {
        Node<T> node = new Node<>();
        node.setValue(value);
        node.setNext(head);
        //Nowy wezel dodany wiec jest jako head
        head = node;
        size++;
    }

    public T pop() {
        if (head != null) {
            T temp = head.getValue(); //2
            head = head.getNext(); //node(1, null)
            size--;

            return temp;
        } else {
            throw new IllegalStateException("Brak wartosci");
        }
    }

    public void print() {
        Node<T> current = head; // node(4, (3, (2, 1,null))))

        while (current != null) { //iteracja po calym stosie
            System.out.println(current.getValue()); //4
            current = current.getNext(); //(3, (2, 1,null))
        }
    }

    public boolean remove(T value) { //2

        Node<T> current = head; // node(4, (3, (2, 1,null))))

        if (head.getValue().equals(value)) {
            head = head.getNext();
            return true;
        }

        while (current != null) { //iteracja po calym stosie
            //node(4, (3, (2, 1,null)))
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext(); //(3, (2, 1,null))
        }
        return false;
    }

    public void addBottom(T value) { //5
        Node<T> node = new Node<>();
        node.setValue(value);
        node.setNext(null); //bo zawsze na samym dole jest (value, null)

        Node<T> current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(node);
    }


    private static class Node<T> {
        private T value;
        private Node<T> next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
