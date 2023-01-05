package AyseHocaFragen;
import java.util.Scanner;
public class C05_gunismiyazdirma {
    //kul dan gun numarasini alip gun ismini yazdiran bir program yazin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun numarasi girin");
        int gunsayisi = scan.nextInt();
        System.out.println("if else ile cozum.......................................");
        if (gunsayisi <= 0 || gunsayisi > 7) {
            System.out.println("Gecersiz giris yaptiniz");
        } else if (gunsayisi == 1) {
            System.out.println("Pazartesi");
        } else if (gunsayisi == 2) {
            System.out.println("Dienstag");
        } else if (gunsayisi == 3) {
            System.out.println("Mitwoch");
        } else if (gunsayisi == 4) {
            System.out.println("Donerstag");
        } else if (gunsayisi == 5) {
            System.out.println("Freitag");
        } else if (gunsayisi == 6) {
            System.out.println("Samstag");
        } else if (gunsayisi == 7) {
            System.out.println("Sonntag");
        }

        System.out.println("Swich Case ile cozum...............................");

        switch (gunsayisi){
            case 1:
                System.out.println("pazartesi");
                break;
            case  2 :
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case  4 :
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case  6 :
                System.out.println("cumartesi");
                break;
            case  7 :
                System.out.println("Pazar");
             break;

        }

    }



}