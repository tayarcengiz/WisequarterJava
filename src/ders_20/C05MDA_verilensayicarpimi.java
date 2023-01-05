package ders_20;

public class C05MDA_verilensayicarpimi {
    public static void main(String[] arg) {

        //verilen arraydeki sayilarin carpimini donduren method olusturun
        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};
        System.out.println(elementlericarp(arr));
    }


    public static int elementlericarp(int[][] arr){
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];

            }

        }
        return carpim;

    }


}
