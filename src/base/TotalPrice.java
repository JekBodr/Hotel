package base;

// Интерфейс подсчета стоимости за услуги гостиницы

public interface TotalPrice {

    // Включает кол-во звезд, кол-во клиентов, кол-во ночей
    double calculateStarsPrice(double starsChose, int clientsNumber, int nightsNumber);

    // +кол-во взрослых, кол-во детей
    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild, int nightsNumber) ;

    // +кол-во животных
    double calculateStarsPrice(double starsChose, int clientsNumberAdult,int clientsNumberChild,
                               int clientsNumberAnimal, int nightsNumber);
}
