package views;

import exceptions.DomainException;
import models.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReservationView {
    Reservation model;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ReservationView(Reservation model) throws ParseException {
        this.model = model;
    }
    public void getInputs(){


        try {
            System.out.print("Номер комнаты: ");
            int roomNumber = sc.nextInt();
            System.out.print("Дата заезда (dd/MM/yyyy): ");
            Date checkIn = null;
            try {
                checkIn = sdf.parse(sc.next());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            System.out.print("Дата выезда (dd/MM/yyyy): ");
            Date checkOut = null;
            try {
                checkOut = sdf.parse(sc.next());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

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
    // Вывод данных
    public void getOutput(String output) {
        System.out.println(output);
    }
}

