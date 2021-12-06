import controllers.AppController;
import exceptions.WrongNightsQuantity;
import exceptions.WrongDataInput;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws WrongNightsQuantity, ParseException, WrongDataInput {
        AppController appController = new AppController();
        appController.runApp();
    }
}
