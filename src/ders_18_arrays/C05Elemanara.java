package ders_18_arrays;

public class C05Elemanara {
    public static void main(String[] arg) {

        // verilen bir arrayde istenen elemanin olup olmadigini varsa kac kere kullanildigini
        // yazdiran bir method olusturun

        int[] arr= {1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        int arananeleman=3;
        elemanara(arr,arananeleman);


    }
    public static void elemanara(int[] arr, int arananeleman){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananeleman){
                sayac++;
            }

        }
        if (sayac==0){
            System.out.println("Aranan sayi Array de yok");
        } else  {
            System.out.println("Aranan"+arananeleman+"sayisi,array de"+sayac+"kere kullanilmistir");

        }
    }
}
