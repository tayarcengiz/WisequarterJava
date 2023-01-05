package ders_19;

import java.util.Arrays;
import java.util.Scanner;

public class C09KullanicidandegeralarakArrayolusturma {
    public static void main(String[] arg) {
        //kul dan istedigi kadar sayi alip bir array olusturun
        //kul eleman girisini bitirmek icin 0 a bassin

        Scanner scan =new Scanner(System.in);
        int[] arr={0};
        int girilensayi=0;
        do{
            System.out.println("arraye eklemek icin bir tam sayi giriniz"+"\nBitirmek icin 0 a basin");
            girilensayi=scan.nextInt();
            if (arr[0]==0){
                arr[0]=girilensayi;
            }else if(girilensayi!=0){
                arr=C08ArrayeElemanEklemeMethodu.arrayeelemanekle(arr,girilensayi);
                }

        }while (girilensayi!=0);
        System.out.println(Arrays.toString(arr));

    }
}
