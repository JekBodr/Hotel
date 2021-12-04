package applcations;

import exceptions.DomainException;
import models.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationApp {  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
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
    } catch (ParseException e) {
        System.out.println("Неверный формат даты");
    } catch (DomainException e) {
        System.out.println("Ошибка при бронировании: " + e.getMessage());
    } catch (RuntimeException e) {
        System.out.println("Неожиданная ошибка");
    }
    sc.close();
}
}
