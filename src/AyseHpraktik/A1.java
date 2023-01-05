package AyseHpraktik;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("lutfen cumlede aramak isteginiz keimeyi giriniz");
        String kelime=scan.nextLine();

        int sayac=0;
        for (int i = 0; i <= cumle.length()-kelime.length(); i++) {

            if (cumle.substring(i,i+kelime.length()).equalsIgnoreCase(kelime)) {
                sayac++;
            }
        }
        System.out.println(sayac);
        if(sayac>=1) {
            System.out.println("cumlede "+sayac+ " kadar "+kelime+"  vardir");

        }

    }
}
