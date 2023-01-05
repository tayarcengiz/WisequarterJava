package ders_19;

import java.util.Arrays;

public class C06Arrayeyenidegerata {

    public static void main(String[] arg) {

        String str ="java";
        str="hava";
        String[] arr1={"Ali","Veli"};
        String[] arr2={"A","B","C"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));//[A, B, C]

        //var olan arrayin uzunlugu degistirilemez ama yeni bir deger atanabilir.
        //1.var olan bir array i yeni bir deger olarak atayabiliriz.
        //2.istedigimiz uzunlukta yeni bos bir array atayabiliriz.
        arr1= new String[6];//yeni ve bos 6 uzunluklu deger atadik
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]
        //3.yeni olusturulanbir arraye {} icinde deger yazarak atama yapabiliriz
        //ancak var olan bir array yeni deger atamasi icin{} kulllanilamaz. arr1={"s","k"} olmaz






    }
}
