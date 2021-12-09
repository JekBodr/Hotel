package controllers;
import exceptions.WrongNightsQuantity;
import exceptions.WrongDataInput;
import models.Guest;
import views.GuestView;
import models.Reservation;
import views.ReservationView;
import java.util.Scanner;

public class AppController {

    public void runApp() throws WrongNightsQuantity, WrongDataInput {

        try {
            // Вызов метода
            System.out.println("""
                Выберете режим работы программы
                1 - Рассчет стоимости для гостя
                2 - Бронирование номера (для Клиента)""");
            Scanner scanner = new Scanner(System.in);
            int  input = scanner.nextInt();
            validateInputData(input);
            if (input == 1)guest();
            if (input == 2)reservation();

        } catch (WrongDataInput ex) {

            System.out.println("Что-то пошло не так! ");

            // Вывод сообщения из объекта настраиваемого исключения
            System.out.println("Ошибка: " + ex);
            throw new WrongDataInput();
        }
    }

    // реализует рассчет стоимости для гостя
    public void guest() throws WrongNightsQuantity, WrongDataInput {
        Guest model = new Guest();
        GuestView view = new GuestView(model);
        GuestController controller = new GuestController(model, view);
        controller.runApp();
    }

    // реализует бронирования номера (для клиента)
    public void reservation()  {
        Reservation model = new Reservation();
        ReservationView view = new ReservationView(model);
        ReservationController controller = new ReservationController(model,view);
        controller.runApp();
    }

    static void validateInputData(int quota) throws WrongDataInput {

        if (quota <1 || quota > 2 ) {
            // Выброс объекта пользовательского исключения
            throw new WrongDataInput("Выбирайте 1 или 2!");
        } else {
            System.out.println("Cпасибо, продолжайте работу с программой.");
        }
    }
}
