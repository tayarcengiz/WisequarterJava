package hazirlikdersleri;

import java.util.Scanner;

public class C05_BasamaklariBulma00 {
    public static void main(String[] arg) {
        //kullanıcıdan 3 basamaklaı pozitif tasm sayi al rakamlarti toplamini bul
        System.out.println(23 / 5);  //4.6 ==> 4
        System.out.println(123 % 10); //  3
        System.out.println(123 / 10);// 12

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;

        System.out.println("Birler Basamagi:" + birler);
        System.out.println("Onlar Basamagi:" + onlar);
        System.out.println("Yuzler Basamagi:" + yuzler);

    }
}
