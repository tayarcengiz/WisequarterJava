package ders_15_Over;

import java.util.Scanner;

public class C07_WhileloopSifre {
    public static void main(String[] args) {
        // kuldan sifre isteyin ,asagidaki sartlari saglamayan sifreyi yenilemesini isteyin
        //basarirsa basarili yazdir sartlar: ilk harf kucuk, son karakter sayi olmali


        Scanner scan =new Scanner(System.in);
        boolean sifregecerlimi=false;
        String sifre="";int bayrak;

        //int toplam=0;
        //int girilensayi=0;
        while(sifregecerlimi!=true) {
            bayrak=0;
            System.out.println("Lutfen sifrenizi girin");
            sifre=scan.nextLine();

            if (!(sifre.charAt(0)>'a'&& sifre.charAt(0)<='z')){
                System.out.println("sifrenin ilk harfi kucuk olmali");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("son karakter sayi olmali");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmali");
                bayrak++;
            }
            if (bayrak==0){
                sifregecerlimi=true;
                System.out.println("sifreniz basariyla kaydedildi");
            }

            }



        }

}
