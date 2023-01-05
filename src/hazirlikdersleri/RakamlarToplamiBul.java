package hazirlikdersleri;

import java.util.Scanner;

public class RakamlarToplamiBul {
    public static void main(String[] arg) {
        //kullanıcıdan 3 basamaklaı pozitif tasm sayi al rakamlarti toplamini bul
        System.out.println(23/5);  //4.6 ==> 4
        System.out.println(123 % 10); //  3
        System.out.println(123/10);// 12

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi=0; // 123 için
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;  //birler basamagini bulur
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //birler bas rakamlar toplamına eklenmiş hali 3
        sayi=sayi/10;    // birler basamagi cikrilir ,artik sayi iki basamakli olur.
        // böylece birler basamagindaki sayi bulunur


        birlerBasamagi=sayi%10;  //birler basamagini bulur
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //birler bas rakamlar toplamına eklenmiş hali 3+2=5
        sayi=sayi/10;    // birler basamagi cikrilir ,artik sayi bir basamakli olur.
        //boylece onlar basanagındaki sayi bulunur

        birlerBasamagi=sayi%10;  //birler basamagini bulur
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //birler bas rakamlar toplamına eklenmiş hali 5+1=7
        sayi=sayi/10;    // birler basamagi cikrilir ,artik sayi iki basamakli olur.0 kalınca işlem sonlandirilir
        // boylece yuzler basamagindaki sayi bulunur.

        System.out.println("Sayinin Rakamlari Toplami"  + rakamlarToplami);












    }
}
