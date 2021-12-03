package controllers;

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

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double starsPrice = model.calculateStarsPrice(model.getStarsQuantity());
        double totalPrice = model.calculateStarsPrice(starsPrice, model.getGuestsQuantity(),
                model.getNightQuantity());
        String paymentInitialRounded = Rounder.roundValue(totalPrice);
        String hotelName = model.choseHotel(model.getStarsQuantity());
//
//        double discount = model.calculateDiscount(paymentInitial);
//        String discountRounded = Rounder.roundValue(discount);
//
//        String paymentRounded = Rounder.roundValue(model
//                .calculatePayment(paymentInitial, discount));

       String output = "------------------------------\n" +
                "Название отеля: " + hotelName +
                "\nКолличество ночей: " + model.getNightQuantity() +
                "\nСума к оплате (грн.): " + paymentInitialRounded + "\n";
//                "Сумма скидки (грн.): " + discountRounded + "\n" +
//                "К оплате (грн.): " + paymentRounded;

        view.getOutput(output);
    }
}
