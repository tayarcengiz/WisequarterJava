package AyseHocaFragen;

import java.util.Scanner;

public class UcgenOlusturma {
    /*
     Kullanicidan 3 tane pozitif  tam sayi alniz.
     bu uc sayinin ucgen olusturma durumunu kontrol ediniz
     eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz

     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
     herhangi iki kenar farkı diger kenardan kücük olmali
      a+b>c>a-b
      a+c>b>a-c
      b+c>a>b-c
     a=b=c ise es kenar ucgen
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi giriniz : ");
        int topAveB = 0, farkAveB = 0;
        int topAveC = 0, farkAveC = 0;
        int topBveC = 0, farkBveC = 0;

        int a,b,c;
        a = scan.nextInt();

        String yanlisGirisMesaji = "Girdiginiz deger 0'dan kucuk olamaz! ";

        if(a<=0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }

        b = scan.nextInt();

        if(b<=0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }

        c = scan.nextInt();

        if(c<=0) {
            System.out.println(yanlisGirisMesaji);
            System.exit(0);
        }

        topAveB = a + b ;
        topAveC = a + c ;
        topBveC = b + c ;

        farkAveB = Math.abs(a-b); // Mutlak deger
        farkAveC = Math.abs(a-c);
        farkBveC = Math.abs(b-c);

        if (topAveB>c && c>farkAveB &&
                topAveC>b && b>farkAveC &&
                topBveC>a && a>farkBveC)  {
            System.out.println("Girdiginiz degerler ile ucgen olusturulabilir.");
            if(farkAveB == 0 && farkBveC == 0 ){
                System.out.println("Girdiginiz degerler ile olusan ucgen eskenar ucgendir.");
            }
        }else System.out.println("Girdiginiz degerler ile ucgen olusturulamaz.");

    }

}
