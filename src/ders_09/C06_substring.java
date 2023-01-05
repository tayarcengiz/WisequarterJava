package ders_09;

public class C06_substring {

    public static void main(String[] arg) {

        String str = "Java ogren isi kap";

        System.out.println(str.substring(5));
        System.out.println(str.substring(0)); //Java ogren, isi kap
        System.out.println(str.length() -1);
        String sonHarf;
        sonHarf=str.substring(str.length()-1);

        System.out.println(sonHarf); //p
        // son indeksteki kar upper case olarak yazdir

        System.out.println(str.substring(str.length()-1).toUpperCase()); // p

        // son 3 harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(str.length()-3).toUpperCase());

        System.out.println(str);






    }
}
