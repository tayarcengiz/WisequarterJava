package ders_27immutableDateendtime;

import java.time.LocalTime;

public class C05_Dateandtime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);//18:22:22.736863300

        LocalTime saat2=LocalTime.of(19,10,25);
        System.out.println(saat2);//19:10:25
        System.out.println(saat.compareTo(saat2));//-1



    }
}
