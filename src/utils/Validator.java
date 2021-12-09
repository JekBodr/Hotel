package utils;

import exceptions.WrongDataInput;

import java.util.Scanner;

public class Validator {

    // Валидация ввода имени
    // доработал с исключением
    public static String validateNameSymbols(Scanner scanner) throws WrongDataInput {
        String str = scanner.nextLine();
        if (str.matches("-?\\d+") ||str.isEmpty()) {
            throw  new WrongDataInput("Введите имя на латинице или кириллице");
        }
        return str;
    }
    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите числовое значение!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите число больше 0: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // метод позволяет ввести ноль, применяется для несовершеннолетних детей
    // и животных
    public static int validateQuantityInputWithZero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите числовое значение!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity < 0) {
            System.out.println("Вы ввели отрицательное значение: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }
}
