package controllers;

import Exeptions.WrongNightsQuantity;
import models.Client;
import utils.Rounder;
import views.ClientView;

public class ClientController {
    Client model;
    ClientView view;

  //   Конструктор
    public ClientController(Client model, ClientView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() throws WrongNightsQuantity {

        view.getInputs();

        String name = model.getName();

        double starsPrice = model.calculateStarsPrice(model.getStarsQuantity());
        double totalPrice = model.calculateStarsPrice(starsPrice, model.getGuestsAdultQuantity(),
                model.getGuestsChildQuantity(),
                model.getGuestsAnimalQuantity(),
                model.getNightQuantity());
        String paymentInitialRounded = Rounder.roundValue(totalPrice);
        String hotelName = model.choseHotel(model.getStarsQuantity());


       String output = "------------------------------\n" +
                "Название отеля: " + hotelName +
                "\nКолличество ночей: " + model.getNightQuantity() +
                "\nСума к оплате (грн.): " + paymentInitialRounded + "\n";

        view.getOutput(output);
    }
}
