import controllers.AppController;
import exceptions.WrongNightsQuantity;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws WrongNightsQuantity, ParseException {
//            Guest model = new Guest();
//            GuestView view = new GuestView(model);
//            GuestController controller = new GuestController(model, view);
//            // Запуск программы/приложения
//            controller.runApp();
        AppController appController = new AppController();
        appController.runApp();
    }
}
