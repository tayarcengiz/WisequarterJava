package ders_35Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryException {
    //kul dan istedigi kadar sayi isteyip girilen sayilari toplayin.
    //kul nin islemi bitirmesi icin q ya basmasini isteyin.ve q ya basilinca kac
    // sayi girdigini ve toplamlamlarini yazdirin
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        Double girilensayi=1.0;
        Double girilensayilarintoplami=1.0;
        int sayac=0;
        boolean devam=true;

        while (devam){
            System.out.println("toplamak icin sayi giriniz.\nBitirmek icin Q ya basin");

            try {
                girilensayi= scan.nextDouble();
            } catch (InputMismatchException e) {

                break;
            }

            girilensayilarintoplami+=girilensayi;
            sayac++;
        }
        System.out.println("girilen "+sayac+"sayini toplami:"+girilensayilarintoplami);
    }
}
