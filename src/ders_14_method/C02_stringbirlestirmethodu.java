package ders_14_method;

public class C02_stringbirlestirmethodu {
    //verilen iki stringi aralarinda bosluk birakarak main donduren method olusturun
    public static void main(String[] arg) {
        String str1="Java";
        String str2="Candir";
        System.out.println(birlestirMethodu(str1,str2));
        System.out.println(birlestirMethodu("Bu da", "oldu"));
        System.out.println(birlestirMethodu("Anladiniz", "mi"));




    }
    public static String birlestirMethodu(String str1,String str2) {
        return str1+" "+str2;


    }

    public static void birlestiMethodu() {
    }
}
