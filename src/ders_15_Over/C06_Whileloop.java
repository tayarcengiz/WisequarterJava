package ders_15_Over;

import java.util.Scanner;

public class C06_Whileloop {
    public static void main(String[] args) {
        // kul dasn sayi al toplam 500 e esit olur veya gecerse
       //girilen sayi adedi,    girilen sayilarin toplami ve bukadsar yeter yazdirin
        Scanner scan =new Scanner(System.in);
        double sayac=0;
        double toplam=0;
        double girilensayi=0;
        while(toplam<500) {
            System.out.println("lutfen toplam icin tamsayi girin" );
            girilensayi=scan.nextDouble();
            sayac++;
            toplam+=girilensayi;

        }
        System.out.println("girilen"+sayac+"adet sayinin toplami:"+toplam+"  bu kadar yeter");

    }
}
