package ders_36_checkedException;

import java.util.Scanner;

public class C03 {
    //kull dan yasini isteyin eger negatif sayi girerse uyari olarak illegalexception verin
    //ancak kod calismaya devam etsin.

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yas gir");
        int yas=scan.nextInt();
        if(yas<=0){

            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                System.out.println("yas 0 olamaz");
            }

        }

    }
}
