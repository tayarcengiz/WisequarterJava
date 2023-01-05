package ders_14_method;

public class C04oncekimethotlaricagir {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        //carpım sonucunu yeni kod yazmadan konsola yazdirin
        System.out.println(C01Doublebirlestirmethodu.carpimMethodu(a,b));
        String c="Nasil";
        String d="yani";

        System.out.println(C02_stringbirlestirmethodu.birlestirMethodu(c, d));

        String e = "Bu da mi oldu"; //stringi tersten yazdir
        System.out.println(C03_String_Terse_Cevirme.stringiTerseCevir(e));
        System.out.println(C03_String_Terse_Cevirme.stringiTerseCevir("Bu cumleyi ters cevir"));


        String str="Java cok guzel";
        System.out.println(str.toUpperCase());










    }
}
