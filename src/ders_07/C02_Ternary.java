package ders_07;

public class C02_Ternary {
    public static void main(String[] arg) {

        String str1="Ali";
        String str2="ali";
        // verilen iki metin birbiri ile ayni ise "metimler Ayni"
        // farkli ise metinler farkli yazdir

        if (str1.equals(str2)){
            System.out.println("Metinler Ayni");

        }else {
            System.out.println("Metinler Farkli");

        }
        System.out.println(str1.equals(str2) ? "Metinler Ayni" :"Metinler Farkli");




    }



}
