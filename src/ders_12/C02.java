package ders_12;

public class C02 {
    public static void main(String[] args) {



        for (int i =1 ; i<=10;i++) {

        System.out.println(i+" ");}
        System.out.println("");

        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdir
        for (int i=10; i<100; i++) {
            if (i%7==0) System.out.print(i+" ");

        }
        System.out.print("");

        //13 den baslayip 100 ekadar 7ser 7 ser artirarak yazdir
        for (int i = 13; i <= 100; i += 7) {
            System.out.print(i + " ");//  13 20 27 34 41 48 55 62 69 76 83 90 97

        }
        System.out.println("");

        // 1 den 10 a kadar sinirlar dahil sayilarin karelerini yazdiğr
        for (int i =1 ; i<=10;i++ ){
            System.out.print(i*i + " ");    //1 4 9 16 25 36 49 64 81 100

        }
        System.out.println("");


    }

}

