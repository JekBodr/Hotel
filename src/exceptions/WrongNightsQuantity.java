package exceptions;

public class WrongNightsQuantity extends Exception {

        private String checkData;

        public WrongNightsQuantity() {
            checkData = "Максимальное количество ночей 10";
        }

        @Override
        public String toString() {
            return  checkData;
        }
    }

