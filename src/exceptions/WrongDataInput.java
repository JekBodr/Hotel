package exceptions;

public class WrongDataInput extends Exception {
    private final String checkData;

    public WrongDataInput() {
        checkData = "Ошибка ввода данных";
    }

    public WrongDataInput(String message) {
        super(message);
        checkData = message;
    }
    @Override
    public String toString() {
        return  checkData;
    }
}
