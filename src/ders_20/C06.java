package ders_20;

public class C06 {
    public static void main(String[] arg) {

        // verilen iki katli array de herbir inner array in son elementini yazdiran method olustur.
        int[][] arr={{5,7},{5,8,9},{0,0}};
        sonelementleritopla(arr);

    }
    public static void sonelementleritopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i][(arr[i].length-1)];




        }
        System.out.println("son elementler toplami:"+toplam);
    }
}
