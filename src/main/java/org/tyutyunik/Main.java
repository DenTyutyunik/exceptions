package org.tyutyunik;

import org.tyutyunik.service.UserValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.print("Повторите пароль: ");
        String confirmPassword = scanner.nextLine();

        // Check data
        try {
            UserValidator.validateUser(login, password, confirmPassword);
        } catch (UserValidator.WrongLoginException | UserValidator.WrongPasswordException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
