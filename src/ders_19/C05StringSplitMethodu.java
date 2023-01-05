package ders_19;

import java.util.Arrays;

public class C05StringSplitMethodu {
    public static void main(String[] arg) {
        String str ="Java gercekten cok cok guzel";
        String[] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi));//[Java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length);//5

        System.out.println("metindeki e sayisi:"+(eArrayi.length-1));//4



        String[] tumkarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumkarakterlerArr));

        int sayac=0;
        //bir loop ile tum karakterleri kontrol edelim

        for (int i = 0; i < tumkarakterlerArr.length; i++) {
            if (tumkarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("metindeki e sayisi:"+sayac);

    }
}
