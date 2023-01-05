package ders_19;

import ders_18_arrays.C03_Arrayartirma;
import ders_18_arrays.C04Elementleritopla;
import ders_18_arrays.C05Elemanara;
import ders_18_arrays.C06_kullaniciyaArrayolusturma;

import java.util.Arrays;

public class C03Rrayelemanlariniartirma {
    public static void main(String[] arg) {

        //verilen bir string elementlerini 2 artirin
        int[] arr={2,3,4};
        arr=C03_Arrayartirma.elementleri2artir(arr);
        System.out.println(Arrays.toString(arr));//

        //Arrayin elemanlarini toplayip sonucu yazdir
        System.out.println(C04Elementleritopla.pozitifelementleritopla(arr));// 4.5.6=15
        //arr arrayinde 10 element olarak var mi?
        C05Elemanara.elemanara(arr,10);//aranan sayi arrayde yok
        // kul dan deger alarak array olustur
        int[] yeniarray= C06_kullaniciyaArrayolusturma.arrayolustur();
        System.out.println(Arrays.toString(yeniarray));

    }
}
