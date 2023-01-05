package ders_10;

public class C05_Soru {
    public static void main(String[] arg) {
        // mail kontrolu yapan program hazirlayin
        // mail Q isareti icermiyorsa "gecersiz email" yazdiriğn
        // @gmail.com ile bitmiyorsa "yazim hatasi yazdirin"


        String email = "ahmet@gmail.com";
        if (!email.contains("@")) ;{
        System.out.println("gecersiz email");

        //}else if (!email.contains("@gmail.com"));{
            System.out.println("gmail adresini giriniz");



      //  }else if (!email.endsWith("@gmail.com"));{
            System.out.println("yazim hatasi");

      //  } else {
            System.out.println("email basari ile kaydedildi");

        }









        // System.out.println(str.endsWith("guzel")); // guzel ile mi bitiyor //t
        //System.out.println(str.endsWith(""));//t
        //ystem.out.println(str.endsWith("Java her yerde guzel"));//t
        //System.out.println(str.endsWith("Java")); //f


    }
}
