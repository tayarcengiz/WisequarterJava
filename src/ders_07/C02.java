package ders_07;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kg olarak kilonuzu giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();

        double vke=(agirlik+1000/(boy*boy));
        System.out.println("Vucut kitle endeksiniz:" +vke);
        if (vke>30) {
            System.out.println("Obez");
        } else if (vke>25) {
            System.out.println("kilolu");
        }else if (vke>20) {
            System.out.println("Normal");
        } else if (vke>0) {
            System.out.println("Zayıf");
        }else {
            System.out.println("yanlis bilgi girildi");



        }


    }

}