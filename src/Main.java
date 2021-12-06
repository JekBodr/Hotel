import controllers.AppController;
import exceptions.WrongNightsQuantity;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws WrongNightsQuantity, ParseException {
        AppController appController = new AppController();
        appController.runApp();
    }
}
