package BaiTap1;

import java.time.LocalDate;
import java.util.IllformedLocaleException;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        NhapDate();
    }
    static void NhapDate() throws IllformedLocaleException{
        Scanner nhap = new Scanner(System.in);
        int day = nhap.nextInt();
        int month = nhap.nextInt();
        int year = nhap.nextInt();
        if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year <= 2022 && year >= 1990 ){
            System.out.println(LocalDate.of(year,month,day));
        }
        else {
            throw new IllformedLocaleException();
        }
    }
}
