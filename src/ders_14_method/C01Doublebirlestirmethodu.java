package ders_14_method;

import java.util.Scanner;

public class C01Doublebirlestirmethodu {
    public static void main(String[] arg) {

        //main metod icinde iki sayi alin carpimlarini bize dondur
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi girin");
        double sayi1=scan.nextDouble();//5


        double sayi2=scan.nextDouble();//3
        carpimMethodu(sayi1,sayi2);//15
        double carpimsonucu=carpimMethodu(6,2);//12
        System.out.println(carpimMethodu(sayi1,sayi2));




    }
    public static double carpimMethodu(double sayi1,double sayi2){
        System.out.println("carpım methodu calıştı");
        return sayi1*sayi2;
    }
}
