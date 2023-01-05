package ders_27immutableDateendtime;

import java.time.LocalDate;

public class C04_Lokaltime {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-10-29

        System.out.println(tarih.minusDays(100));//100 gun onceki tarih2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(2));//2022-09-22 (5 hafta 2 gun once)
        System.out.println(tarih.plusDays(10));//2022-11-08      ( 10 gun sonra)
        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2022-09-21
        System.out.println(tarih.plusMonths(5)
                .plusWeeks(2)
                .plusDays(3)); // 2023-04-15

        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth());//october
        System.out.println(tarih.getDayOfWeek());//saturday
        System.out.println(tarih.getDayOfYear());//302,gun
        System.out.println(tarih.isLeapYear());// false  bu yil artik yil degil

        System.out.println(tarih.withYear(1996).isLeapYear());//true
        System.out.println(tarih.withYear(1991).withMonth(10).withDayOfMonth(15).getDayOfYear());//288
        System.out.println(tarih.withYear(1991).withMonth(10).withDayOfMonth(15).getDayOfWeek());//Tuesday


    }
}
