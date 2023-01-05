package ders_11;

public class C08_Soru {
    public static void main(String[] arg) {
        //kullanıcıdan sifre iste asagidaki sartlari saglamali eksiklerini soyle,
        //tum sartlari saglarsa sifre basariyla kaydedildi yazdir.
        // ilk harf kucuk harf olmalı 2,son karakter rakam olmali 3,sifre bosluk icermemeli
        //4,uzunlugu en az 10 karakter olmali

        String sifre="Fdeg7hjlll9";
        int bayrak=0;


        if((sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmamali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;

        }
        if (sifre.contains(" ")){

            System.out.println("sifre bosluk icermemeli");
            bayrak++;




        }
        if (!(sifre.length()>=10)){
            System.out.println("sifre en az 10 haneli olmamali");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }
    }
}
