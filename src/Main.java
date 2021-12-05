import controllers.ReservationController;
import exceptions.DomainException;
import models.Reservation;
import views.ReservationView;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws DomainException, ParseException {
        Reservation model = new Reservation();
        ReservationView view = new ReservationView(model);
        ReservationController controller = new ReservationController(model,view);
        // Запуск программы/приложения
        controller.runApp();
    }
}



