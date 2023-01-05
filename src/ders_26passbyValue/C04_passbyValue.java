package ders_26passbyValue;

import java.util.ArrayList;
import java.util.List;

public class C04_passbyValue {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
       yenilistdegeriata(sayilar);
        System.out.println("method call dan sonrasayilar list:"+sayilar);
    }

    //bir method olusturalim icinde liste olusturalim o listeye elementlerin 5 er fzlasini koy .
    // sonra sayilar listesine yeni listi ata ve sayilar listini yazdirin

    public static void yenilistdegeriata(List<Integer> sayilar){
        List<Integer> yenilist=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            yenilist.add(sayilar.get(i) +5);
        }
        sayilar=yenilist;
        System.out.println(sayilar);
        System.out.println(sayilar);

    }







}
