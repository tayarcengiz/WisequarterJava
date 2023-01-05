package ders_09;

public class C02_Equals {
    public static void main(String[] arg) {

        String str1 = "Ali";
        String str2 = "ali";

        String str3 = new String( "Ali");
        String str4 = "Ali";
        System.out.println(str1==str2); // f
        System.out.println(str1==str3); // f
        System.out.println(str1==str4);// t

        // -- stringleri karsilastirirken beklenen sonuclari vermeyebilir.
        // stringlerde == yerine equals() kullanilir.

        System.out.println((str1.equals(str2)));  //false
        System.out.println((str1.equals(str3)));  //t
        System.out.println((str1.equals(str4)));  //t









    }
}
