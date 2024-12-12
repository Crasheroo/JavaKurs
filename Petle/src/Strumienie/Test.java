package Strumienie;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        User user1 = new User(1L, "Ada", "Antczak", "a_antczak@email.com", 3456.5, 20, Job.JAVA_DEVELOPER);
        User user2 = new User(2L, "Beata", "Byk", "b_byk@email.com", 11223.5, 33, Job.SCALA_DEVELOPER);
        User user3 = new User(3L, "Czesław", "Cios", "c_cios@email.com", 6500.D, 33, Job.JAVA_DEVELOPER);
        User user4 = new User(4L, "Daria", "Chodkowska", "d_chodkowska@email.com", 2344.3, 40, Job.JAVA_DEVELOPER);
        User user5 = new User(5L, "Artur", "Boski", "a_boski@email.com", 8798.1, 21, Job.KOTLIN_DEVELOPER);
        User user6 = new User(6L, "Grzegorz", "Cyrych", "g_cytych@email.com", 12333D, 25, Job.GROOVY_DEVELOPER);
        User user7 = new User(7L, "Igor", "Drzewicki", "i_drzewicki@email.com", 12333D, 26, Job.JAVA_DEVELOPER);
        User user8 = new User(8L, "Lidia", "Figura", "l_figura@email.com", 1243D, 28, Job.SCALA_DEVELOPER);
        User user9 = new User(9L, "Norbert", "Gość", "n_gosc@email.com", 12322D, 45, Job.GROOVY_DEVELOPER);
        User user10 = new User(10L, "Urszula", "Grotkowska", "u_grotkowska@email.com", 11333D, 30, Job.SCALA_DEVELOPER);

        List<User> users = List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);


        // Zadanie 1
//        users.stream()
//                .filter(u -> u.getSalary() > 5000)
//                .forEach(System.out::println);

        // Zadanie 2
//        users.stream()
//                .map(u -> u.getEmail())
//                .forEach(System.out::println);

        //Zadanie 3
//        String collect = users.stream()
//                .map(u -> u.getEmail())
//                .collect(Collectors.joining(","));
//        System.out.println(collect);

        //Zadanie 4
//        long count = users.stream()
//                .filter(u -> u.getJob().equals(Job.JAVA_DEVELOPER))
//                .filter(u -> u.getAge() % 2 == 0)
//                .count();
//        System.out.println(count);

        //Zadanie 5
//        DoubleSummaryStatistics doubleSummaryStatistics = users.stream()
//                .mapToDouble(u -> u.getSalary())
//                .summaryStatistics();
//        System.out.println(doubleSummaryStatistics);

        // Zadanie 6
//        users.stream()
//                .filter(u -> u.getId().equals(1L))
//                .findFirst()
//                .ifPresent(System.out::println);

        // Zadanie 7
//        users.stream()
//                .filter(u -> u.getAge() > 25)
//                .forEach(System.out::println);

        // Zadanie 8
//        boolean whoHas33Years = users.stream()
//                .anyMatch(u -> u.getAge() == 33);

        // Zadanie 9
//        boolean bezsensuSprawdzenieBoZadanie8Pokazuje = users.stream()
//                .allMatch(u -> u.getAge() == 33);
//        if (bezsensuSprawdzenieBoZadanie8Pokazuje) {
//            System.out.println("Wszyscy maja 33 lata");
//        } else {
//            System.out.println("Nie wszyscy");
//        }

        // Zadanie 10
//        users.stream()
//                .map(u -> {
//                    u.setSalary(u.getSalary() + 500);
//                    return u;
//                })
//                .forEach(System.out::println);

        //Zadanie 11
//        users.stream()
//                .filter(u -> u.getFirstName().toLowerCase().contains("a"))
//                .toList()
//                .forEach(System.out::println);
    }


}
