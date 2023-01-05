package AyseHocaFragen;

import java.util.Random;
import java.util.Scanner;

public class Q16SayiTahminiOyunu {
    // BILGISAYAR 0-100 ARASI TUTUP KULLANICIDAN TAHMIN ISTER
// SAYIYI BULANA KADAR KUCULT VEYA BUYUT DIYE YOL GOSTERIR
// BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
    public static void main(String[] args) {
        System.out.println("Hosgeldiniz!");
        Random r = new Random();
        int num = r.nextInt(100);
        int bul = num;
        //System.out.println(num);
        Scanner scan = new Scanner(System.in);
        int count = 1;
        num = 1;
        do {
            if(count==1){
                System.out.print("0 ile 100 arasinda bir sayi tuttum \nBunu tahmin et :");
            }else if (bul>num) System.out.println("Daha buyuk sayi giriniz");
            else System.out.println("Daha kucuk sayi giriniz");
            num = scan.nextInt();
            if (num == bul ) {
                System.out.println("Dogru tahmin! " + count + ". tahminde buldunuz");
            }else System.out.println("Yanlis tahmin! Denemeye devam et!");
            count++;
        }while(num!=bul);
    }

}
