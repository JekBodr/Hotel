package base;

// Интерфейс подсчета стоимости за услуги гостиниці

public interface TotalPrice {
    double calculateStarsPrice(double starsChose, int clientsNumber, int nightsNumber);

    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild, int nightsNumber) ;

    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild,
                               int clientsNumberAnimal, int nightsNumber);
}
