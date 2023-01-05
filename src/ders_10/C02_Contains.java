package ders_10;

public class C02_Contains {
    public static void main(String[] arg) {
        // bir seyi icerip icermedigine bakilir

        String str = "Java ile kodlama cok zevkli";
        str.contains("cok");

                // CharSequence: karakter, char dizisi
        System.out.println(str.contains("cok"));//t
        System.out.println(str.contains("odla"));//t
        System.out.println(str.contains("a")); // true
        // bunu kabul etmez  System.out.println(str.contains('s'));
        System.out.println(str.contains("java")); // false

        String str2= "Java";
        System.out.println(str.contains(str2));  // true

        String str3 ="234 Ali Can";
        str3.contains("2");











        //String str1 = "Java gun gectikce guzellesiyor";

        //System.out.println(str.substring(5, 8)); // 5 ve 8. harf arasi: gun


    }
}
