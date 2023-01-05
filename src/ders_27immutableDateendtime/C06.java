package ders_27immutableDateendtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C06 {
    public static void main(String[] args) {
        LocalDateTime zaman =LocalDateTime.now();
        System.out.println(zaman);//2022-10-29T18:30:51.024805800
        System.out.println(zaman.getDayOfYear());//302.gun


        //dogumunuzdanbugune kac gun gecti
        LocalDate bugun = LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1975,01,15);

        Period gecensure=Period.between(dogumgunu,bugun);
        System.out.println(gecensure);//P47Y9M14D
        System.out.println(gecensure.getYears());//47


    }
}
