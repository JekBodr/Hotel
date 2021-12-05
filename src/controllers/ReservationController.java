package controllers;

import models.Reservation;
import views.ReservationView;

public class ReservationController {
    Reservation model;
    ReservationView view;


    public ReservationController(Reservation model, ReservationView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp(){
        view.getInputs();
    }
}
