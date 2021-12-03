package base;

import Exeptions.WrongNightsQuantity;

public interface TotalPrice {
    double calculateStarsPrice(double starsChose, int clientsNumber, int nightsNumber);

    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild, int nightsNumber) throws WrongNightsQuantity;


}
