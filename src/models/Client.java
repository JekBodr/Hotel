package models;

import base.StarsChose;
import utils.Validator;

import java.util.Scanner;

public class Client implements StarsChose {
    private String name;
    private int nightQuantity;
    private int guestsQuantity;
    private int starsQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNightQuantity() {
        return nightQuantity;
    }

    public void setNightQuantity(int nightQuantity) {
        this.nightQuantity = nightQuantity;
    }

    public int getGuestsQuantity() {
        return guestsQuantity;
    }

    public void setGuestsQuantity(int guestsQuantity) {
        this.guestsQuantity = guestsQuantity;
    }

    public int getStarsQuantity() {
        return starsQuantity;
    }

    public void setStarsQuantity(int starsQuantity) {
        this.starsQuantity = starsQuantity;
    }

    // Расчёт стоимости номера в зависимости от коллчества звезд отеля.
    @Override
    public double calculateStarsPrice(int stars) {
       double sum = 0;
       if (stars == 1) sum = 250;
       else if (stars == 2) sum = 350;
       else if (stars == 3) sum = 500;
       else if (stars == 4) sum = 750;
       else if (stars == 5) sum = 1000;
       return sum;

    }
}

