package ders_26passbyValuex;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {

        //verilen array elementleri 5 artir yazdir

        int [] arr ={3,4,5};
        elementleri5artir(arr);
        elementleri5artir(arr);
        elementleri5artir(arr);
        System.out.println(Arrays.toString(arr));//[18, 19, 20]

    }
    public static void elementleri5artir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i] +5;


        }
    }
}
