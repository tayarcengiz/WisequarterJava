package ders_13nestedforloop_methotolusturma;

import java.util.Scanner;

public class C08_metodolusturma {
    public static void main(String[] arg) {
        //kullanıcıdan 2 sayi al topla ve yazdir
        istetoplayazdir();
        istetoplayazdir();




        }
        public static void istetoplayazdir() {
        Scanner scan =new Scanner(System.in);
            System.out.println("lutfen iki sayi girin");
            double sayi1= scan.nextDouble();
            double sayi2= scan.nextDouble();
            System.out.println("girilen sayilarin toplami"+(sayi1+sayi2));


        }
}


