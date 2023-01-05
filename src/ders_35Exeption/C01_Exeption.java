package ders_35Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exeption {
    //kul dan tam sayi al sayinin karesini yazdir. kul ondalik
    // sayi girerse kul uyari verip tekrar yazdirmasini isteyin.
    public static void main(String[] args) {
       sayialkaresiniyazdir();

    }
    public  static void sayialkaresiniyazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tam sayi gir");

        int girilensayi=0;

        try {
            girilensayi= scan.nextInt();
            System.out.println("girilen sayinin karesi:");
            System.out.println(girilensayi*girilensayi);

        } catch (InputMismatchException e) {
            System.out.println("sana tam sayi gir dedik");
            sayialkaresiniyazdir();
        }


    }


}
