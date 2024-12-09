package Zadanie_Siedem.Cwiczenie_Siedem_2;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        String test1 = "   Cymek to gej     ";
        String test2 = "napis z malych do zmiany";

        String apply = trimFunction.apply(test1);
        String apply1 = toUpperCase.apply(test2);

        System.out.println(apply);
        System.out.println(apply1);
    }

    static private Function<String, String> trimFunction = String::trim;
    static private Function<String, String> toUpperCase = String::toUpperCase;
}
