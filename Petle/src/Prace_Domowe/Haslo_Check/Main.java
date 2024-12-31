package Prace_Domowe.Haslo_Check;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj hasło: ");
        String password = sc.nextLine();
        String specialCharacters = "!@#$%^&*()";
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char passwordChar = password.charAt(i);

            if (specialCharacters.contains(Character.toString(passwordChar))) {
                hasSpecialChar = true;
                break;
            }
        }

        if (hasSpecialChar) {
            System.out.println("Haslo ma znak specjalny");
        } else {
            System.out.println("Haslo srednie na jeza");
        }
        sc.close();
    }
}
