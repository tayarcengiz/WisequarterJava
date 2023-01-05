package ders_08;

public class C02_Ternary {

    public static void main(String[] arg) {
        int a=5;
        // Ternary operatoru tek basina kullanılamaz.bie sonuc uretir.
        // sonuc ya direk yazdirilmali yada bir Variable ye atanmalidir.
        String sonuc = a%2==0 ?"cift sayi" : "teksayi";
        String sonuc2=a>10? "buyuk sayi" : "" +2*a; // cte vermemesi icin stringe cevirdik

        System.out.println(a>10 ? "buyuk sayi" : 2*a);


    }
}
