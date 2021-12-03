package models;

import base.HotelName;
import base.StarsChose;
import base.TotalPrice;

public class Client implements StarsChose, TotalPrice, HotelName {
    private String name;
    private int nightQuantity;
    private int guestsAdultQuantity;
    private int guestsChildQuantity;
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

    public int getGuestsAdultQuantity() {
        return guestsAdultQuantity;
    }

    public void setGuestsAdultQuantity(int guestsAdultQuantity) {
        this.guestsAdultQuantity = guestsAdultQuantity;
    }

    public int getStarsQuantity() {
        return starsQuantity;
    }

    public void setStarsQuantity(int starsQuantity) {
        this.starsQuantity = starsQuantity;
    }

    public int getGuestsChildQuantity() {
        return guestsChildQuantity;
    }

    public void setGuestsChildQuantity(int guestsChildQuantity) {
        this.guestsChildQuantity = guestsChildQuantity;
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

    @Override
    public double calculateStarsPrice(double starsChose, int clientsNumber, int nightsNumber) {
        return starsChose * clientsNumber * nightsNumber;
    }

    @Override
    public double calculateStarsPrice(double starsChose, int clientsNumberAdult, int clientsNumberChild, int nightsNumber) {
        return starsChose * clientsNumberAdult * (clientsNumberChild *0.7) * nightsNumber;
    }

    @Override
    public String choseHotel(int stars) {
        String name = null;
        if (stars == 1) name = "Cheap Hostel";
        else if (stars == 2) name = "Expensive Hostel ";
        else if (stars == 3) name = "Motel";
        else if (stars == 4) name = "Hotel";
        else if (stars == 5) name = "Kharkov Palace";
        return name;
    }
}

