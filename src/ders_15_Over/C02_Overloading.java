package ders_15_Over;

public class C02_Overloading {
    public static void main(String[] args) {
        carpim(3,5);
        carpim(2.3,4);

    }
    public static void carpim(int sayi1,int sayi2){
        System.out.println("iki sayinin carpimi:"+ sayi1*sayi2);
    }
    public static void carpim(int sayi1,int sayi2,int sayi3) {
        System.out.println("uc sayinin carpimi:" + sayi1 * sayi2*sayi3);
    }
    public static void carpim(double sayi1,int sayi2) {
        System.out.println("double integer iki sayinin carpimi:" + sayi1 * sayi2);
    }
    public static void carpim(int sayi1,double sayi2) {
        System.out.println("intiger double sayinin carpimi:" + sayi1 * sayi2);
    }

}
