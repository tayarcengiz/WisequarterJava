package ders_27immutableDateendtime;

public class C02_StringPool {
    public static void main(String[] args) {
        String str1 ="Java";
        String str2 = "Java";
        String str3= new String("Java");
        String str4="";
         str4="Java";
         String str5="Ja";
        str5= str5.concat("va");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1==str2);//true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false

         System.out.println(str1.equals(str4));//true
        System.out.println(str1==str4);//true
   // == true olmasi icin hem referans hemde adres ayni olmalidir-
        System.out.println(str1=="Java");//true
        System.out.println(str3=="Java");//true


        System.out.println(str1.equals(str5));//true
        System.out.println(str1==str5);//false

    }
}
