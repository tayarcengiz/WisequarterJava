package ders_26passbyValuex;

import java.util.ArrayList;
import java.util.List;

public class C02_PassbyValueList {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);//[15, 25, 35]
        sayilar.add(20);//[20, 30, 40]
        sayilar.add(30);
        elementleri5artir(sayilar);//[25, 35, 45]


        elementleri5artir(sayilar);
        elementleri5artir(sayilar);
        elementleri5artir(sayilar);
        //method call sonrasi tekrar yazdirirsak
    }
    public static void elementleri5artir(List<Integer> sayilar){

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,sayilar.get(i) +5);

        }
        System.out.println(sayilar);
    }
}
