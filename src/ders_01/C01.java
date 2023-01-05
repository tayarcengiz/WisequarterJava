package ders_01;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen ay isminin ilk harfini girin");
            char ilkHarf = scan.next().charAt(0);
            if (ilkHarf == 'o' || ilkHarf == 'O') {
                System.out.println("Ocak");
            }

            if (ilkHarf == 's' || ilkHarf == 'S') {
                System.out.println("Subat");
            }

            if (ilkHarf == 'm' || ilkHarf == 'M') {
                System.out.println("Mart veya Mayis");
            }

            if (ilkHarf == 'n' || ilkHarf == 'N') {
                System.out.println("Nisan");
            }

            if (ilkHarf == 'h' || ilkHarf == 'H') {
                System.out.println("Haziran");
            }

            if (ilkHarf == 't' || ilkHarf == 'T') {
                System.out.println("Temmuz");
            }

            if (ilkHarf == 'a' || ilkHarf == 'A') {
                System.out.println("Agustos veya Aralik");
            }

            if (ilkHarf == 'e' || ilkHarf == 'E') {
                System.out.println("Eylul veya Ekim");
            }

            if (ilkHarf == 'k' || ilkHarf == 'K') {
                System.out.println("Kasim");
            }


    }
}
