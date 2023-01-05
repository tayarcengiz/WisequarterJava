package ders_20;

public class C02MDAelementleritoplama {
    public static void main(String[] arg) {

        int[]arr1={3,5,7,8};
        int toplam=0;
        for (int i = 0; i <arr1.length; i++) {
            toplam+=arr1[i];

        }
        System.out.println("tek katli array elementler toplami:"+toplam);//23

        int[][] arr={{1,2},{3,4,5},{7}};
        //elementlerini topla
        toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }


        }
        System.out.println("2 katli arrayin elementleri toplami:"+toplam); //22


    }
}
