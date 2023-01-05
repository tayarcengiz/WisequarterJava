package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C01_Elementekleme {
    public static void main(String[] args) {


        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar);//[]
        sayilar.add(10);
        System.out.println(sayilar);//10

        sayilar.add(20);//[20] tersi soylenmeden sona ekleme yapar.
        System.out.println(sayilar);//[10,20]

        sayilar.add(1,15);
        System.out.println(sayilar);//[10, 15, 20]
        //listenin basina 44 ekleyin
        sayilar.add(0,44);
        System.out.println(sayilar);


        List<Integer> eklenecekliste=new ArrayList<>();
        eklenecekliste.add(3);
        eklenecekliste.add(5);
        sayilar.addAll(eklenecekliste);
        System.out.println(sayilar);//[44, 10, 15, 20, 3, 5]
        //44 den sonra eklenecek listeyi tekrar yukleyin
        sayilar.addAll(1,eklenecekliste);//[44, 10, 15, 20, 3, 5]
        System.out.println(sayilar);//[44, 3, 5, 10, 15, 20, 3, 5]







    }




}
