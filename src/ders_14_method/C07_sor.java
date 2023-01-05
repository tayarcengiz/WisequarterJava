package ders_14_method;


public class C07_sor {
    public static void main(String[] args) {
        //pozitif tam sayi al asal sayi olup olmadigini kontrol et sonucu yazdir


        int sayi =23;
        System.out.println (asalSayiKontrolEt (sayi));
        System.out.println (asalSayiKontrolEt (10));
        System.out.println (asalSayiKontrolEt (153));



    }

    public static String asalSayiKontrolEt(int sayi) {

        String sonuc ="";

        for (int i = 2; i <= (sayi-1); i++) {
            if (sayi%i==0) {
                sonuc = "asal degil";
                break;
            }

        }
        if (!sonuc.equals("asal degil")) {
                sonuc = "asal";
        }


        return sonuc;




    }
}


