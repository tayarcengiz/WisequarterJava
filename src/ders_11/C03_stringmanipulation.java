package ders_11;

public class C03_stringmanipulation {
    public static void main(String[] arg) {
        String str = "J1ava2 g9uzel5dir8";
        //str deki sayilari silip java guzeldir yazdirma:
        //str.replaceAll() sadece bir harf degil genelleme ile
        // soyleyebilecegimiz ortak ozellikte tum karakterleri degistirir.

        System.out.println(str.replaceAll("\\d",""));//tum digitleri yok eder rakamlari
        System.out.println(str.replaceAll("\\D",""));//tum digit olmayan yani harfleri yok eder


        String s1= "ilk urun fiyati:1250 tl";
        String s2= "ikinci urun fiyati:1500 tl";
        //iki urun fiyatini toplayalim

        System.out.println(s1=s2.replaceAll("\\D","")); //1250
        System.out.println(s2=s2.replaceAll("\\D",""));//1500

        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750 rakam degerleri ınteger toplar







    }
}
