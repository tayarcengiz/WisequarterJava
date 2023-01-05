package ders_19;

import java.util.Arrays;

public class C08ArrayeElemanEklemeMethodu {
    public static void main(String[] arg) {
        //verilen bir int arraye istenen bir elementi ekleyip yeni halini donduren method olusturun

        int[] abc={3,5,8,9};
        int ekleneceksayi=1;
        abc=arrayeelemanekle(abc,ekleneceksayi);
        System.out.println(Arrays.toString(abc));//[3, 5, 8, 9, 1]

    }

    public static int[] arrayeelemanekle(int[] eklenecekarr,int ekleneceksayi){

        int[] yeniarray=new int[eklenecekarr.length+1];
        for (int i = 0; i < eklenecekarr.length; i++) {
            yeniarray[i]= eklenecekarr[i];

        }
        yeniarray[yeniarray.length-1]=ekleneceksayi;
        return yeniarray;

    }
}
