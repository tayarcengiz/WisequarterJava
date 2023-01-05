package ders_18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_kullaniciyaArrayolusturma {
    public static void main(String[] arg){
        //kullanicidan array icin boyut ve icerecegi ementler icin veri al bize donduren method olustur
        int[] kullaniciarrayi= arrayolustur();
        System.out.println(Arrays.toString(kullaniciarrayi));//[3, 2, 5, 9]



    }

    public static int[] arrayolustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("olusturulacak arrayin boyutunu giriniz");

        int length = scan.nextInt();
        int[] kullaniciarrayi = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Array e eklenecek bir sayi giriniz");
            kullaniciarrayi[i] = scan.nextInt();

        }
        return kullaniciarrayi;
    }




}
