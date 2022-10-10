package BaiTap2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.IllformedLocaleException;
import java.util.Scanner;

public class CustomAgeException extends RuntimeException {
    public static void main(String[] args) {
        TinhSoTuoi();
    }

    static void TinhSoTuoi() {
        Scanner nhap = new Scanner(System.in);
        LocalDate date = LocalDate.of(2000, 4, 9);
        LocalDate dateNhap = null;
        int day = nhap.nextInt();
        int month = nhap.nextInt();
        int year = nhap.nextInt();
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year <= 2022 && year >= 1990) {
            dateNhap = LocalDate.of(year, month, day);
        }
        if (ChronoUnit.DAYS.between(date, dateNhap) != 0){
            Period p = Period.between(date, dateNhap);
            long p2 = ChronoUnit.DAYS.between(date, dateNhap);
            System.out.println(p.getYears() + " year " +
                    p.getMonths() + " month " +
                    p.getDays() + " day");
            System.out.printf("%d year %02d month %02d days (%d days)",p.getYears(),p.getMonths(),p.getDays(),p2);
        }
        else {
            throw new CustomAgeException();
        }
    }
}
