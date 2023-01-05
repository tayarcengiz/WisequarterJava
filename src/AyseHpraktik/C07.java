package AyseHpraktik;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore
          hafta ici veya hafta sonu yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz : ");
        String gunIsmi = scan.nextLine();

        // PAZARTESI , pazartesi, Pazartesi, pAzArTeSI

        gunIsmi = gunIsmi.toLowerCase();

        switch (gunIsmi) {
          //  case "pazartesi", "sali", "carsamba", "persembe", "cuma" -> System.out.println("Girdiginiz gun haftaicidir.");
          //  case "cumartesi", "pazar" -> System.out.println("Girdiginiz gun haftasonudur.");
          //  default -> System.out.println("Gecersiz gun ismi girdiniz!");
        }
    }

}
