package ders_12;

public class C06_AsalSayiBulma {
    public static void main(String[] args) {



    //bir loop u sonunu beklemeden bitirmel istersek
    //kul nın verdigi bir sayinin asal sayi olup olmadigini bulun

        int sayi=53;
        int bayrak =0;

        for(int i =2; i<=sayi-1; i++){
           if (sayi % i==0) {
               // askimiz bitti=true;
               //bayrak = true;
               bayrak++;
               break;
           }
        }
        System.out.println(bayrak);
        if (bayrak==0){
            System.out.println("asal sayi");

        }else {
            System.out.println("asal sayi degil");
        }


    }
}



