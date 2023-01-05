package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_topluelemanekleme {
    public static void main(String[] args) {
        List<String> harfler =new ArrayList<>();
        //tum sesli harfleri listeye ekle

        String [] arr ={"a","e","i","o","u"};
        //eklenecek tum harfleri bir array olarak yazin
        //sonra for loop ile listeye ekleyin

        for (int i = 0; i < arr.length; i++) {
            harfler.add(arr[i]);

        }
        System.out.println(harfler);////[a, e, i, o, u]

    }
}
