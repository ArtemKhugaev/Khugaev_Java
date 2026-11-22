package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double a = readNumber(scanner, "Введите первое число : ");
        double b = readNumber(scanner, "Введите второе число : ");

        System.out.println("Сложение: " + calc.sum(a, b));
        System.out.println("Вычитание: " + calc.diff(a, b));
        System.out.println("Умножение: " + calc.multiply(a, b));

        try {
            System.out.println("Деление: " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка, деление на 0 невозможно");
        }




        scanner.close();
    }

    private static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {

                System.out.println("Ошибка, введите число");
                scanner.nextLine();
            }
        }
    }
}
