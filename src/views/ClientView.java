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
    int guestsAdult;
    int guestsChild;
    int guestAnimal;
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


        title = "Введите количество взрослых гостей: ";
        System.out.print(title);
        guestsAdult = Validator.validateQuantityInput(scanner);
        model.setGuestsAdultQuantity(guestsAdult);

        title = "Введите количество несовершеннолетних гостей: ";
        System.out.print(title);
        guestsChild = Validator.validateQuantityInput(scanner);
        model.setGuestsChildQuantity(guestsChild);

        title = "Введите количество животных: ";
        System.out.print(title);
        guestAnimal = Validator.validateQuantityInput(scanner);
        model.setGuestsAnimalQuantity(guestAnimal);



        title = "Введите количество звезд (от 1й до 5ти): ";
        System.out.print(title);
        stars = Validator.validateQuantityInput(scanner);
        model.setStarsQuantity(stars);


        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}
