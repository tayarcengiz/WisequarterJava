package ders_12;

public class C04_forloops__rakamlartoplami {
    public static void main(String[] args) {
      //verilen sayinin rakamlari toplamini bulun
      int sayi=1453589;
      String sayiStr=""+sayi;
      int birlerBasamagi = 0;
      int rakamlarToplami =0;
      for (int i = 1; i<=sayiStr.length() ; i++){
          birlerBasamagi=sayi%10;
          rakamlarToplami=rakamlarToplami+birlerBasamagi;
          sayi=sayi/10;


        }
        System.out.println(rakamlarToplami);


    }
}
