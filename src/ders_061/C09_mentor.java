package ders_061;

import java.util.Scanner;

public class C09_mentor {
    public static void main(String[] args) {
       //kullanıcıdan bir sayi al integer a cevir
      // Scanner scan = new Scanner(System.in);
      //  System.out.println("bir sayi gir");
       // String stringsayi1=scan.next();
       // String stringsayi2 =scan.next();
       // System.out.println(stringsayi1);

       // if (Integer.parseInt(stringSayi)>=0  || Integer.parseInt(stringsayi)<0) {

      //  int sayiConverted=Integer.parseInt(stringsayi);
       // System.out.println(sayiConverted );  // suanki bilgilerimizle basaramadik



        // soru ogrenmek istediginiz ayin numarasini giriniz

        byte ay =new Scanner(System.in).nextByte();
        switch (ay ) {
            case 1:
            System.out.println("ocak");

            case 2:
                System.out.println("subat");

            case 3:
                System.out.println("mart");

            case 4:
                System.out.println("nisan");


            case 5:
                System.out.println("mayis");

            case 6:
                System.out.println("haziran");

            case 7:
                System.out.println("temmuz");


            case 8:
                System.out.println("agustos");


            case 9:
                System.out.println("eylul");

            case 10:
                System.out.println("ekim");
                break;

            case 11:
                System.out.println("kasim");

            case 12:
                System.out.println("aralik");
        }




    }
}
