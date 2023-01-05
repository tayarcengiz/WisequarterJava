package ders_10;

public class C04_EndWith {

    public static void main(String[] arg) {
        // kullanicidan bir cumle ve metin alin o cumlenin metni icermesine gore asagidakilerden
        //uygun olani yazdirin
        String str = "Java her yerde guzel";
        System.out.println(str.endsWith("guzel")); // guzel ile mi bitiyor //t
        System.out.println(str.endsWith(""));//t
        System.out.println(str.endsWith("Java her yerde guzel"));//t
        System.out.println(str.endsWith("Java")); //f








        //String str = "manti acarken java ogrenilmez";


        //System.out.println(str.startsWith("manti")); // t
        //System.out.println(str.startsWith("m")); //t


    }
}
