package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import models.Reservation;

public class ReservationApp {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Номер комнаты: ");
        int roomNumber = sc.nextInt();
        System.out.print("Дата заезда (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Дата выезда (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
        System.out.println("Бронирование: " + reservation);

        System.out.println("\nВведите данные для обновления бронирования:");
        System.out.print("Дата заезда (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());
        System.out.print("Дата выезда (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());

        reservation.updateDates(checkIn, checkOut);
        System.out.println("Бронирование: " + reservation);

        sc.close();

    }

}
