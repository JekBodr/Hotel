package controllers;
import exceptions.WrongNightsQuantity;
import models.Guest;
import views.GuestView;
import models.Reservation;
import views.ReservationView;
import java.text.ParseException;
import java.util.Scanner;

public class AppController {

    public void runApp() throws WrongNightsQuantity, ParseException {
        System.out.println("""
                Выберете режим работы программы
                 1 - Рассчет стоимости для гостя
                2 - Регистрация номера (для Клиента)""");
        Scanner scanner = new Scanner(System.in);
        int  input = scanner.nextInt();
        if (input == 1)guest();
        if (input == 2)reservation();
    }

    public void guest() throws WrongNightsQuantity {
        Guest model = new Guest();
        GuestView view = new GuestView(model);
        GuestController controller = new GuestController(model, view);
        controller.runApp();
    }

    public void reservation() throws ParseException {
        Reservation model = new Reservation();
        ReservationView view = new ReservationView(model);
        ReservationController controller = new ReservationController(model,view);
        controller.runApp();
    }
}
