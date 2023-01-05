package ders_09;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] arg) {

        String str= " Java mutluluktur";
        System.out.println(str.toUpperCase()); // Java mutluluktur

        str= str.toUpperCase();
        System.out.println(str);
        str = "ince mehmet";
        str= str.toUpperCase();
        System.out.println(str);  // ınce mehmet
        str= str.toUpperCase();
        System.out.println(str);

        // str= str.toLowerCase()
        System.out.println(str.toLowerCase(Locale.CHINA));




    }
}
