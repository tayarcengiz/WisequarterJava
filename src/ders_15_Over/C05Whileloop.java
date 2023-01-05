package ders_15_Over;

import java.util.Scanner;

public class C05Whileloop {
    public static void main(String[] args) {
        /*
        kul dan tam sayi al kul 0 a basarsa sayi alma islemini bitir.
        kul dan kac sayi geldigini ve toplamlarini bulunuz
         */
        Scanner scan =new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        int girilensayi=5; //sayi 0 olursa loop biter
        while(girilensayi!=0) {
            System.out.println("lutfen toplam icin tamsayi girin" +
                    "\nBitirmek icin 0 a basin");
            girilensayi=scan.nextInt();
            if (girilensayi !=0){
                sayac++;

                toplam=toplam+girilensayi;

            }

        }
        System.out.println("girilen"+sayac+"adet sayinin toplami:"+toplam);
    }



}
