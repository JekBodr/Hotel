package exceptions;

public class WrongNightsQuantity extends Exception {
    private final String checkData;

    public WrongNightsQuantity(String s) {
        checkData = s +" Максимальное количество ночей 10";
        }

        @Override
        public String toString() {
            return  checkData;
        }
    }

