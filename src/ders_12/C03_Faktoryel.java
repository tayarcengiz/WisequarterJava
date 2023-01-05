package ders_12;

public class C03_Faktoryel {
    public static void main(String[] args) {
    // verilen sayinin faktoriyelini bulalim
    //5!= 120

    int sayi=10;
    int faktoryel=1;
    for (int i =sayi; i>=1; i--) {
        faktoryel = faktoryel * i;
    }
        System.out.println(faktoryel);//3628800


    //1 den 100 kadar sayilari topla:
        int toplam=0;
        for (int i=1; i<=100; i++){
            toplam=toplam+i;

        }
        System.out.println(toplam);//5050
    }

}
