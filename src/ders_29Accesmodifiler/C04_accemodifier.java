package ders_29Accesmodifiler;

public class C04_accemodifier {
    String isim ="Ali";//Defauld acces modifier gecerlidir.bu ders 29 icerisi class lardan kullnilabilir.
    //default int sayi=10; bu yazilamaz. java hata verir.

          private static int sayi=10;


    public static void main(String[] args) {
        System.out.println(sayi);//10
        sayi=20;
        System.out.println(sayi);//20




    }
}
