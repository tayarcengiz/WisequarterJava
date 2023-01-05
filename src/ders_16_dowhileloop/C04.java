package ders_16_dowhileloop;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // sifre isteyin asagidaki sartlar olusunca sifre kabul edildi yazdir
        //sifre kucuk ve buyuk harfve ozel karakter icermeli, ve 8 karakter oenaz olmali
        Scanner scan=new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifredogrumu;

        do {
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            // tum hatalari tek sefer de soylemesini istiyorsak bagimsiz if ve bayrak kullanmaliyiz
            bayrak=0;
            // kck harf icermelidir bubun icin tum harfleri iceren konrol for loop yapmaliyiz
            int sonuc = kucukharfkontroluyapmetodu(sifre);
            //kucuk harf kontrolu yapan method olusturalim
            bayrak=bayrak+sonuc;
            // sifre buyuk harf icermelidir
            sonuc=buyukharfkontroluyap(sifre);
            // buyuk harf kontrolu yapan metod olusturalim varsa 1 yoksa 0 dondursun
            bayrak=bayrak+sonuc;
            // sifre ozel karakter icermelidir metodu olusturalim
            sonuc=ozelkarakterkontroluyap(sifre);
            bayrak=bayrak+sonuc;

            // sifre en az 8 karakter olmalidir
            if(sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmalidir");
            }else {
                bayrak++;
            }

           //bayrak 4 ise sifre tamam degise hata vardir




        }while (bayrak!=4);
        System.out.println("sifre basariyla kaydedilde,tebrikler");


    }

    public static int ozelkarakterkontroluyap(String sifre) {
        int bayrak=0;
        String ozelKarakterler="£#$*,;.:";
        //sifre ozel karakter icermelidir bunun icin for loop yapmaliyiz sifre birini iceriyorsa bize yeterli olur
        for(int i=0; i<sifre.length();i++ ){
            if(ozelKarakterler.contains(sifre.substring(i,i+1))){
                bayrak++;
                break;

            }

        }
        //bayrak==0 iseozel karakter yoktur bir hata vardir bunu yazdirali
        if (bayrak==0){
            System.out.println("sifre ozel karakter icermelidir");
            return 0;

        }else return 1;
    }

    public static int buyukharfkontroluyap(String sifre) {
        int bayrak=0;
        // kck harf icermelidir bubun icin tum harfleri iceren konrol for loop yapmaliyiz
        //1 tane kucuk harf bulmak yeterli olacak
        for (int i=0;i<sifre.length();i++){
            if(sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z'){
                bayrak++;
                break;
            }
        }

        //bayrak==0 ise hata vardir, buyuk harf yoktur.bunu yazdiralim
        if(bayrak==0){
            System.out.println("sifre buyuk harf icermelidir");
            return 0;
        }else return 1;
    }

    public static int kucukharfkontroluyapmetodu(String sifre) {
        int bayrak=0;
        // kck harf icermelidir bubun icin tum harfleri iceren konrol for loop yapmaliyiz
        //1 tane kucuk harf bulmak yeterli olacak
        for (int i=0;i<sifre.length();i++){
            if(sifre.charAt(i)>='a'&& sifre.charAt(i)<='z'){
                bayrak++;
                break;
            }
        }

        //bayrak==0 ise hata vardir, kucuk harf yoktur.bunu yazdiralim
        if(bayrak==0){
            System.out.println("sifre kucuk harf icermelidir");
            return 0;
        }else return 1;

    }
}
