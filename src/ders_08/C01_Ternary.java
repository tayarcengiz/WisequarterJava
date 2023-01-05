package ders_08;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] arg) {

        //kullanicidan bir sayi al sayi pozitif ise 2 katini yazdir
        // pozitif degilse sayiya 10 ekle yazdir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi gir");
        double sayi =scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi*2);

        }else {
            System.out.println(sayi+10);
        }
        System.out.println(sayi>0? 2*sayi: sayi+10);








    }


}
