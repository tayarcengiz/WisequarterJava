package ders_09;

public class C03_String {
    public static void main(String[] arg) {

        String str1 = "Ali";
        String str2 = "ali";

        String str3 = ( "Ali");
        String str4 = "Ali";
        System.out.println(str1.equals(str2)); // f
        System.out.println(str1.equals(str3)); // f

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.equalsIgnoreCase("Ali Can")); // false
        //equalsIgnorcase ayni metni kucuk buyuk harfle olusan ayni metni esit kabul eder.






    }
}
