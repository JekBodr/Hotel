package base;



public interface TotalPrice {
    double calculateStarsPrice(double starsChose, int clientsNumber, int nightsNumber);

    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild, int nightsNumber) ;

    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild,
                               int clientsNumberAnimal, int nightsNumber);


}
