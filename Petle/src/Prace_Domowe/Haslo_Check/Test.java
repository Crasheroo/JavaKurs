package Prace_Domowe.Haslo_Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> specialChars = new ArrayList<>();
        List<Character> passwordChars = new ArrayList<>();

        System.out.println("Podaj hasło: ");
        String password = sc.nextLine();
        String specialsString = "!@#$%^&*()-={}[]";


        for (int i = 0; i < password.length(); i++) {
            char litera = password.charAt(i);
            passwordChars.add(litera);
        }

        for (int j = 0; j < specialsString.length(); j++) {
            char specialChar = specialsString.charAt(j);
            specialChars.add(specialChar);
        }

        for (int i = 0; i < specialChars.size(); i++) {
            Character c = specialChars.get(i);

            for (int j = 0; j < passwordChars.size(); j++) {
                Character c1 = passwordChars.get(j);

                if (c1 == c) {
                    System.out.println("Haslo zawiera znak specjalny es");
                    break;
                }

            }
        }


    }
}
