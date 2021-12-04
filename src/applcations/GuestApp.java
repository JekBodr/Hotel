package applcations;

import controllers.GuestController;
import models.Guest;
import views.GuestView;

public class GuestApp {
    public static void main(String[] args) {
            Guest model = new Guest();
            GuestView view = new GuestView(model);
            GuestController controller = new GuestController(model, view);
            // Запуск программы/приложения
            controller.runApp();
    }
}
