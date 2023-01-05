package AyseHocaFragen;

import java.util.Scanner;

public class C04_kimoncedogdu {
    /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir program yaziniz.

    2010/05/23

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yil / Ay / Gun olarak karsilastirmak " +
                "istediginiz ilk dogum gununu giriniz "); // Ahmet

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();

        System.out.println("Lutfen Yil / Ay / Gun olarak karsilastirmak " +
                "istediginiz ikinci dogum gununu giriniz "); // Ayse

        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();

        if (yil1 > yil2) {
            System.out.println("Ayse Ahmet'ten buyuktur");
        } else if (yil2 > yil1) {
            System.out.println("Ahmet Ayse'den buyuktur");
        } else {   // Bu satira geldigimizde yillar esittir, bu durumda aylara bakmak icin yeni if blogu olusturulur.

            if (ay1 > ay2) {
                System.out.println("Ayse Ahmet'ten buyuktur");
            } else if (ay2 > ay1) {
                System.out.println("Ahmet Ayse'den buyuktur");
            } else { // Bu satira geldigimizde aylar esittir, bu durumda gunlere bakmak icin yeni if blogu olusturulur.

                if (gun1 > gun2) {
                    System.out.println("Ayse Ahmet'ten buyuktur");
                } else if (gun2 > gun1) {
                    System.out.println("Ahmet Ayse'den buyuktur");
                } else System.out.println("Ayni gun dogdunuz");
            }
        }

        System.out.println("***************************2. Cozum***************************");

        int ahmetDogumGunu = yil1 * 10000 + ay1 * 100 + gun1; //20100812
        int ayseDogumGunu = yil2 * 10000 + ay2 * 100 + gun2;  //20100824

        if (ahmetDogumGunu>ayseDogumGunu)
            System.out.println("Ayse daha buyuktur");
        else if (ayseDogumGunu>ahmetDogumGunu)
            System.out.println("Ahmet daha buyuktur");
        else System.out.println("Ayni gun dogdunuz");
    }
}
