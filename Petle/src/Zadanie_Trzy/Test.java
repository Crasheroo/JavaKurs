package Zadanie_Trzy;

public class Test {
    public static void main(String[] args) {
        Stack stackString = new Stack();
        stackString.push("1");
        stackString.push("2");
        stackString.push("3");
        stackString.push("4");

        stackString.print();
        System.out.println();
        stackString.remove("3");
        stackString.remove("2");
        stackString.print();

    }
}
