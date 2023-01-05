package AyseHocaFragen;

import java.util.Scanner;

public class MukemmelSayi {
   /*
            * Bir sayının mükemmel olup olmadığını bulan bir program yazınız.
     *
             *
             * Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine
     * eşitse o sayı mükemmeldir.
            *
            * ORNEK:
            *
            * INPUT : 6
            *
            * OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
            */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz :");

        int number = scan.nextInt();

        int bolenlerinToplami = 0;
        int i = 1;

        do{
            if (number%i==0){
                bolenlerinToplami += i;
            }
            i++;
        }while(i<number);

        if(bolenlerinToplami==number) System.out.println(number + " mukemmel sayidir.");
        else System.out.println(number + " mukemmel sayi degildir.");
    }

}
