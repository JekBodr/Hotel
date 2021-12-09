package views;
import exceptions.WrongNightsQuantity;
import exceptions.WrongDataInput;
import models.Guest;
import utils.Validator;
import java.util.Scanner;

public class GuestView {
    Guest model;
    String title;
    String name;
    int stars;
    int nights;
    int guestsAdult;
    int guestsChild;
    int guestAnimal;
    Scanner scanner;

    // Конструктор
    public GuestView(Guest model) {
        this.model = model;
    }

    // Ввод данных
    public void getInputs() throws WrongNightsQuantity, WrongDataInput {

        // Создаем экземпляр Scanner
        scanner = new Scanner(System.in);

        // Ввод и валидация данных
        // доработал валидатор: выбьет исключение
        // если введено пустая строка, или цифровое значение
        title = "Введите имя клиента: ";
        System.out.print(title);

        try {
            name = Validator.validateNameSymbols(scanner);
            model.setName(name);
        } catch (WrongDataInput e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        // выбросит исключение если введено больше 10
        try {
            // Вызов метода
            title = "Введите количество  ночей: ";
            System.out.print(title);
            nights = Validator.validateQuantityInput(scanner);
            validateInputData(nights);
            model.setNightQuantity(nights);
        } catch (WrongNightsQuantity ex) {
            System.out.println("Что-то пошло не так! ");
            // Вывод сообщения из объекта настраиваемого исключения
            System.out.println("Ошибка: " + ex);
            throw new WrongNightsQuantity("Что-ты делаешь?");
        }

        title = "Введите количество взрослых гостей: ";
        System.out.print(title);
        guestsAdult = Validator.validateQuantityInput(scanner);
        model.setGuestsAdultQuantity(guestsAdult);

        title = "Введите количество несовершеннолетних гостей: ";
        System.out.print(title);
        guestsChild = Validator.validateQuantityInputWithZero(scanner);
        model.setGuestsChildQuantity(guestsChild);

        title = "Введите количество животных: ";
        System.out.print(title);
        guestAnimal = Validator.validateQuantityInputWithZero(scanner);
        model.setGuestsAnimalQuantity(guestAnimal);

        title = "Введите количество звезд (от 1й до 5ти): ";
        System.out.print(title);
        stars = Validator.validateQuantityInput(scanner);
        if(stars <= 5) model.setStarsQuantity(stars);
        else {
            throw new WrongDataInput("Максимальное колличестов звёзд 5");
        }

        // Закрываем Scanner
        scanner.close();
    }

    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }

    static void validateInputData(int quota) throws WrongNightsQuantity {

        if ( quota > 10) {
            // Выброс объекта пользовательского исключения
            throw new WrongNightsQuantity("допустимо выбрать от 1 до 10 ночей");
        } else {
            System.out.print("");
        }

    }
}