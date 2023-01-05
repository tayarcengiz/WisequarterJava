package ders_43;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03 {
    public static void main(String[] args) {
        Set<Integer> sayilar= new HashSet<>();
        sayilar.add(12);
        sayilar.add((15));
        Set<Integer> siraliset=new TreeSet<>();
        siraliset.add(25);
        siraliset.add(29);
        siraliset.addAll(sayilar);
        System.out.println(siraliset);//[12, 15, 25, 29]

        Random rnd=new Random();
        int sayi;
        LocalTime hashBas= LocalTime.now();
        for (int i = 0; i < 1000; i++) {
            sayi= rnd.nextInt(10000);
            sayilar.add(sayi);

        }
        LocalTime hashBit= LocalTime.now();



    }
}
