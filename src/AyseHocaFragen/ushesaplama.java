package AyseHocaFragen;

import java.util.Scanner;

public class ushesaplama {
    public static void main(String[] args) {
        // 1, sayi, 2, sayi us ,neye esit formule et
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayi giriniz");
        int taban= scan.nextInt();
        int us = scan.nextInt();
        long sonuc=1;
        while (us!=0){
            sonuc*=taban;
            us--;

        }
        System.out.println(taban+"istenen sayinin ussu"+sonuc);

    }
}
