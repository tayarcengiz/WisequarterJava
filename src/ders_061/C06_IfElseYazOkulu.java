package ders_061;

public class C06_IfElseYazOkulu {
    public static void main(String[] args) {

        /*
          if else statement'da { } kullanmazsak
          hem if body'si hem de else body'si icin sadece 1 satir kabul eder
          sonraki satirlar if-else ile ilisiklendirilmez
          her durumda calisir
         */


        int not= 56;

        if (not>=50) System.out.println("sinifi gectin");

        else System.out.println("Bu dersten kaldin");



        System.out.println("Yaz okuluna bekleriz :) ");

    }
}
