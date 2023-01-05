package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {
        //soru kul dan pozitif tam sayi al o tamsayidan kucuk fibonacci sayilarini bir
        // liste olarak kaydedin ve yazdirin

        //0112 3 5 8 13 21 34 55 89 144
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozitif tam sayi gir");
        int girilensayi=scan.nextInt();
        if (girilensayi<0){
            System.out.println("fibonacci serisi icin 0 den buyuk sayi girmelisin");
        }else if (girilensayi==0){
            System.out.println("0 dan kucuk fibonacci sayisi yoktur");


        }else if (girilensayi==1){
                System.out.println("1 den kucuk sadece 0 vardir");

        }else {
            fibasayisiniyazdir(girilensayi);
        }
    }
    public static void fibasayisiniyazdir(int girilensayi){
        //buraya gelmisse sayi 1 den buyuktur
        List<Integer> fibonaccilistesi =new ArrayList<>();
        fibonaccilistesi.add(0);
        fibonaccilistesi.add(1);
        fibonaccilistesi.add(1);

        int yenifibonaccisayisi=0;
        int index=3;//ilk 3 eleman 011 old 3, iindexe geldik

        while (yenifibonaccisayisi<girilensayi){
            yenifibonaccisayisi=fibonaccilistesi.get(index-2)+fibonaccilistesi.get(index-1);
            if(yenifibonaccisayisi<girilensayi){
                fibonaccilistesi.add(yenifibonaccisayisi);
            }
            index++;


        }
        System.out.println(fibonaccilistesi);// 5 =>[0, 1, 1, 2, 3]





    }
}
