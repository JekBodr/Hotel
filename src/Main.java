import controllers.AppController;
import exceptions.WrongNightsQuantity;
import exceptions.WrongDataInput;


//запуск программы
public class Main {
    public static void main(String[] args) throws WrongNightsQuantity, WrongDataInput {
        AppController appController = new AppController();
        appController.runApp();
    }
}
