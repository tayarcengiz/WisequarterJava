package ders_10;

public class C03_StartsWith {

    public static void main(String[] arg) {
        String str ="manti acarken java ogrenilmez";


        System.out.println(str.startsWith("manti")); // t
        System.out.println(str.startsWith("m")); //t
        System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith("acarken", 6)); //t

        System.out.println(str.startsWith("manti", 0));//t

        System.out.println(str.startsWith("java", 10));//f














    }



}
