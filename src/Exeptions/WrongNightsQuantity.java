package Exeptions;

public class WrongNightsQuantity extends Exception {

        private String checkData;

        public WrongNightsQuantity() {
            checkData = "Максимальное количество ночей 10";
        }

        public WrongNightsQuantity(String message) {
            super(message);
            checkData = message;
        }
        @Override
        public String toString() {
            return  checkData;
        }
    }

