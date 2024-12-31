package Prace_Domowe.Lista_Uzytkownikow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>();
        users.add(new Person("Alice", Arrays.asList("Admin", "User")));
        users.add(new Person("Bob", Arrays.asList("User", "Moderator")));
        users.add(new Person("Charlie", Arrays.asList("Admin", "Developer")));

        List<String> list = users.stream()
                .flatMap(u -> u.getRoles().stream())
                .distinct()
                .toList();

        System.out.println(list);
    }
}
