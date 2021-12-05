package controllers;

import models.Reservation;
import views.ReservationView;

public class ReservationController {

    ReservationView view;
    Reservation model;


    public ReservationController(ReservationView view, Reservation model) {
        this.view = view;
        this.model = model;
    }

    public void runApp(){
        view.getInputs();



        //view.getOutput();



    }


}
