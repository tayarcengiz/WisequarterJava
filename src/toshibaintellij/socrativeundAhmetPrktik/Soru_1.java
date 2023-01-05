package toshibaintellij.socrativeundAhmetPrktik;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] arg) {

     String str1="Hello World";


        System.out.println(str1.charAt(4));    //o
        System.out.println(str1.length());     // 11   eleman sayisi boslugu da sayar
        System.out.println(str1.charAt(0));    // H    ilk harf
        System.out.println(str1.charAt(str1.length()-1));  // d  son harfi yazdirir

     Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println(isim=isim.toUpperCase());// verilen yaziyi buyuk harflerle yazar
        System.out.println(isim=isim.toLowerCase()); // cumleyi komple kucuk harfe cevirir



      String str2 = "Ayhan Beyhan";
        System.out.println(str2.replace("han","ol")); //ayol Beyol
        System.out.println(str2.length());  // 12 yazar harf sayisi
        System.out.println(str2.replace("A","a")); // a

       String str3= "Java ah java";
        System.out.println(str3.contains("j")); //true  J yi icerir
        System.out.println(str3.contains("x"));  // false yani icermez
       String str4="Ali";
       String str5="ali";
           System.out.println(str4.equals(str5)); // false yani esit degil
           System.out.println(str4.equalsIgnoreCase(str5)); // true buyk kucuk harf farketmezse esit
        // !(false)= true  !(4<5)=false

        System.out.println(str2.substring(7,12)); // "Ayhan Beyhan"=> "eyhan"   8 den 12 ye yazdirir 7 haric
        System.out.println(str2.startsWith("h",2)); // true yani 2 den sonrasi "h" ilemi basliyor
        System.out.println(str2.startsWith("a"));// false  "A" ile basliyor






























    }
}
