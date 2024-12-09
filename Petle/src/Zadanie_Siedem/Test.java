package Zadanie_Siedem;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 15, 20);
        ownInterface<Integer> predicate = x -> x > 10;
        ownInterface<Integer> predicate2 = x -> x % 2 == 0;


        System.out.println(filterList(numbers, predicate));
    }



    @FunctionalInterface
    interface ownInterface<T> {
        boolean test(T number);
    }

    static public List<Integer> filterList(List<Integer> numbers, ownInterface<Integer> predicate) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : numbers) {
            if(predicate.test(number)) {
                newList.add(number);
            }
        }
        return newList;
    }
}
