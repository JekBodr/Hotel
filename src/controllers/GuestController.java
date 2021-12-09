package controllers;
import exceptions.WrongNightsQuantity;
import models.Guest;
import utils.Rounder;
import views.GuestView;

public class GuestController {
    Guest model;
    GuestView view;

  //   Конструктор
    public GuestController(Guest model, GuestView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() throws WrongNightsQuantity {
        view.getInputs();

        double starsPrice = model.calculateStarsPrice(model.getStarsQuantity());
        double totalPrice = model.calculateStarsPrice(starsPrice, model.getGuestsAdultQuantity(),
                model.getGuestsChildQuantity(),
                model.getGuestsAnimalQuantity(),
                model.getNightQuantity());
        String paymentInitialRounded = Rounder.roundValue(totalPrice);
        String hotelName = model.choseHotel(model.getStarsQuantity());

       String output = "------------------------------\n" +
                "Имя клиента" + model.getName()+
                "Название отеля: " + hotelName +
                "\nКолличество ночей: " + model.getNightQuantity() +
                "\nСума к оплате (грн.): " + paymentInitialRounded + "\n";

        view.getOutput(output);
    }
}
