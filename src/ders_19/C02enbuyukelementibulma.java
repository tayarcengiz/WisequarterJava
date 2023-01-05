package ders_19;

import java.util.Arrays;

public class C02enbuyukelementibulma {
    public static void main(String[] arg) {
        //verilen array de enbuyuk ve kucuk sayilariyazdiran method olustur.

        int[] arr={3,8,1,5,2,9};
        enbuyukvekucukelementiyazdir(arr);

    }
    public static void enbuyukvekucukelementiyazdir(int[] arr){
        Arrays.sort(arr);
        System.out.println("enbuyuk element"+arr[arr.length-1]);
        System.out.println("En kucuk element:"+arr[0]);




    }
}
