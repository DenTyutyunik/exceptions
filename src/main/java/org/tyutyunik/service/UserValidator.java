package org.tyutyunik.service;

public class UserValidator {

    public static void validateUser(String login, String password, String confirmPassword) throws Exception {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Ошибка: Некорректный логин");
        }
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Ошибка: Некорректный пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Ошибка: Пароли не совпадают");
        }
    }

    public static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }
}
