package ders_29Accesmodifiler;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    buyuk projelerde datayi READ veya datayi degistirme yetkilerini birbirinden bagimsiz duzenleyebiliriz WRITE.
    accesmodifier ileclass uyelerine baska claslardan erisim sinirlandirilabilir.
     acces te hem okuma hem yazma yetkisi vardir-
    Gercek hayattaki ihtiyaclar dusunulunce java sinirlanmak istenirse okuma olsun yazma olmasin istersek
    encapsulation getter ve setter methodlari kullanilir.
     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        //sayilar.get(1)=10;   get okumaya izin var yazmaya izin yok-
       // System.out.println(sayilar.set(1));// set varsa mutlaka deger atanmalidir.yoksa oncesini okuyamazsin.



    }

}
