package ders_11;

public class C02_Stringmanipulation {
    public static void main(String[] arg) {

        String str = "java candir";
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(' ', '_'));
        System.out.println(str.replace("candir", "cok guzeldir"));
        //candiryerine cok guzeldiryazdirir
        System.out.println(str.replace(" ", "")); //javacandir  boskugu yok etti

        //tum a lari silme
        System.out.println(str.replace("a", "")); // jv cndr

        //Java yerine hava candir yerine cok guzel yazdirma:
        System.out.println(str.replace("java", "hava").
                replace("candir", "ok guzeldir"));//hava cok guzel

        //sadece 1.a yi A yap:
        System.out.println(str.replace( "a","A"));//jAva candir
        System.out.println(str.replace( "","_"));//her harften sonra _ koyar




    }


}
