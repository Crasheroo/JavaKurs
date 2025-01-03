package homework;

import homework.generator.AccountGenerator;
import homework.generator.HoldingGenerator;
import homework.generator.UserGenerator;
import homework.model.*;
import homework.model.Currency;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercises {

    private static final List<Holding> holdings = new HoldingGenerator().generate();

    public static void main(String[] args) {
        System.out.println(getHoldingsWhereAreCompanies());
        System.out.println("1.");
        System.out.println(getHoldingNames());
        System.out.println("2.");
        System.out.println(getCompaniesAmount());
        System.out.println("3.");
        System.out.println(getAllUserAmount());
        System.out.println("4.");
        System.out.println(getUsersForPredicate(Exercises::test));
        System.out.println("5.");
        showAllUser();
        System.out.println("6.");
        System.out.println(getUserPerCompany());
        System.out.println("7.");
        System.out.println(createAccountsMap());
        System.out.println("8.");
        System.out.println(getHoldingNamesAsString());
        System.out.println("9.");
        System.out.println(getAllCompaniesNamesAsLinkedList());
        System.out.println("10.");
        System.out.println(getCurenciesSet());
        System.out.println("11.");
        System.out.println(getRichestMan());
        System.out.println("12.");
        System.out.println(getFirstNCompany(7));
    }

    public static boolean test(User user) {
        if (user.getAge() == 33) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Napisz metodę, która zwróci liczbę holdingów, w których jest przynajmniej jedna firma.
     */
    public static long getHoldingsWhereAreCompanies() {
        return holdings.stream()
                .filter(holdings -> !holdings.getCompanies().isEmpty())
                .count();
    }

    /**
     * Napisz metodę, która zwróci nazwy wszystkich holdingów pisane z wielkiej litery w formie listy.
     */
    public static List<String> getHoldingNames() {
        return holdings.stream()
                .map(holding -> holding.getName())
                .toList();
    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    public static String getHoldingNamesAsString() {
        return holdings.stream()
                .map(c -> c.getName())
                .sorted()
                .toList()
                .toString();
    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    public static long getCompaniesAmount() {
        long count = holdings.stream()
                .map(holding -> holding.getCompanies())
                .count();

        return count;
    }


    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    public static long getAllUserAmount() {
        return holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(companies -> companies.getUsers().stream())
                .count();
    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    public static LinkedList<String> getAllCompaniesNamesAsLinkedList() {
        return holdings.stream()
                .map(holding -> holding.getName())
                .collect(
                        LinkedList::new,
                        LinkedList::add,
                        LinkedList::addAll
                );
    }

    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    public static BigDecimal getAccountAmountInPLN(Account account) {
        return account
                .getAmount()
                .multiply(BigDecimal.valueOf(account.getCurrency().rate))
                .round(new MathContext(4, RoundingMode.HALF_UP));
    }

    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    public static Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
        return holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .flatMap(users -> users.getUsers().stream())
                .filter(userPredicate)
                .map(u -> u.getFirstName())
                .collect(Collectors.toSet());
    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    public static void executeForEachCompany(Consumer<Company> consumer) {
        holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream())
                .forEach(consumer);
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524
    public static Optional<User> getRichestMan() {
        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .flatMap(u -> u.getUsers().stream())
                .filter(s -> s.getSex().equals(Sex.MAN))
                .max(Comparator.comparing(c -> getUserAmountInPLN(c)));
    }

    private static BigDecimal getUserAmountInPLN(final User user) {
        return user.getAccounts()
                .stream()
                .map(c -> c.getAmount())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    private static Set<String> getFirstNCompany(final int n) {
        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .map(c -> c.getName())
                .limit(n)
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    public static Map<String, List<User>> getUserPerCompany() {
        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> c.getUsers()
                ));
    }

    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika, wyrzuca
     * wyjątek IllegalArgumentException.
     */
    public static User getUser(final Predicate<User> predicate) {

        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .filter(predicate)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Ni ma"));
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    public static Map<String, Account> createAccountsMap() {
        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .flatMap(x -> x.getUsers().stream())
                .flatMap(v -> v.getAccounts().stream())
                .collect(Collectors.toMap(
                        c -> c.getNumber(),
                        c -> c
                ));
    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    public static String getUserNames() {
        return holdings.stream()
                .flatMap(z -> z.getCompanies().stream())
                .flatMap(x -> x.getUsers().stream())
                .map(c -> c.getFirstName())
                .distinct()
                .reduce("", (result, next) -> result + next + " ");
    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik
     */
    public static void showAllUser() {
        holdings.stream()
                .flatMap(z -> z.getCompanies().stream())
                .flatMap(x -> x.getUsers().stream())
                .map(c -> c.getFirstName() + " " + c.getLastName())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    public static Set<Currency> getCurenciesSet() {
        return holdings.stream()
                .flatMap(c -> c.getCompanies().stream())
                .flatMap(c -> c.getUsers().stream())
                .flatMap(c -> c.getAccounts().stream())
                .map(c -> c.getCurrency())
                .collect(Collectors.toSet());
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    private static Stream<Company> getCompanyStream() {
        return holdings.stream()
                .flatMap(holding -> holding.getCompanies().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private static Stream<User> getUserStream() {
        return getCompanyStream()
                .flatMap(company -> company.getUsers().stream());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private static Stream<Account> getAccoutStream() {
        return getUserStream()
                .flatMap(user -> user.getAccounts().stream());
    }

}
