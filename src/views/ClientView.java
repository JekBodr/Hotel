package views;

import models.Client;
import utils.Validator;

import java.util.Scanner;

public class ClientView {
    Client model;
    String title;
    String name;
    int stars;
    int nights;
    int guests;
    Scanner scanner;

    // Конструктор
    public ClientView(Client model) {
        this.model = model;
    }

    // Ввод данных
    public void getInputs() {

        // Создаем экземпляр Scanner
        scanner = new Scanner(System.in);

        // Ввод и валидация данных

        title = "Введите имя клиента: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество  ночей: ";
        System.out.print(title);
        nights = Validator.validateQuantityInput(scanner);
        model.setNightQuantity(nights);


        title = "Введите количество  гостей: ";
        System.out.print(title);
        guests = Validator.validateQuantityInput(scanner);
        model.setGuestsQuantity(guests);

        title = "Введите количество звезд (от 1й до 5ти): ";
        System.out.print(title);
        stars = Validator.validateQuantityInput(scanner);
        model.setStarsQuantity(stars);



//        title = "Введите цену: ";
//        System.out.print(title);
//        price = Validator.validatePriceInput(scanner);
//        model.setPrice(price);

        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}
