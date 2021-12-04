package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import applications.ReservationApp;

public class Reservation {

        private Integer roomNumber;
        private Date checkIn;
        private Date checkOut;

        private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

            this.roomNumber = roomNumber;
            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }

        public long duration() {
            long diff = checkOut.getTime() - checkIn.getTime();
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        }

        public void updateDates(Date checkIn, Date checkOut) {
            Date now = new Date();

            this.checkIn = checkIn;
            this.checkOut = checkOut;
        }

        @Override
        public String toString() {
            return "Комната "
                    + roomNumber
                    + ", заезд: "
                    + sdf.format(checkIn)
                    + ", выезд: "
                    + sdf.format(checkOut)
                    + " , "
                    + duration()
                    + " ночей";
        }

    }

