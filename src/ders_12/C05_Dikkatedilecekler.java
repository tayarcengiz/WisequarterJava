package ders_12;

public class C05_Dikkatedilecekler {
    public static void main(String[] args) {

        //for (int i=0; i>-10; i++){
        //  System.out.print(i+" "); sonsuza kadar devam eder


        //ilk deger icin bitis sarti true degilse for calismaz
        //   for(int i=0; i>10; i++){
        // System.out.println(i);


        //bir loop u sonunu beklemeden bitirmel istersek
        //kul nın verdigi bir sayinin asal sayi olup olmadigini bulun

        int sayi = 5300;
        int bayrak = 0;

        for (int i = 2; i <= sayi - 1; i++) {
            if (sayi % i == 0) {
                // askimiz bitti=true;
                // bayrak=true;
                // break;}

                System.out.println(bayrak);
                if (bayrak == 0) {
                    System.out.println("asal sayi");

                } else {
                    System.out.println("asal sayi degil");
                }


            }
        }
    }
}