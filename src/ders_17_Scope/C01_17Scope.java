package ders_17_Scope;

public class C01_17Scope {
    public static void main(String[] args){
        int sayi=10;
        String isim="Ramazan";
        //bir metadun icinde olusturulan veriabellarin scopu icinde olusturulduklari metoddur.
        // ometodun disindan ulasilamazlar.
        for (int i=0;i<10;i++){
            String adres="Ankara";
            System.out.println(adres);


        }
        //ustteki looptan yazdiramaz     loop icinde olusturulan loop icinde kalir
        // System.out.println(adres);

        double pi;
        // System.out.println(pi);  pi deger atanmadigi icin kullanilamaz.

    }
    public static void method1(){


    }
}
