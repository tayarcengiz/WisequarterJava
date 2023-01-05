package ders_44_Maps;

import java.util.Map;

public class C03 {
    public static void main(String[] args) {


        Map<Integer, String> ogrencimap = MapDepo.ornekMapOlustur();

        // 10.satirdan sonra map uzerinde yapacagimiz her degisiklik
        // bu class'daki ogrencimap'i etkiler

        // map'in bu hlini bir gorelim
        System.out.println(ogrencimap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        // map'e 1 tane yeni element ekleyelim
        ogrencimap.put(110, "Fatih-Yan-10-T-MF");

        // 102 numarali ogrenciyi update edelim
        ogrencimap.put(102, "Veli-Dem-12-D-Soz");

        // 103 nolu ogrencinin isim ve soyismini yazdirin
        System.out.println(MapDepo.isimSoyisimDondur(ogrencimap, 103)); // Ali Cem

        // 105 numarali ogrencinin subesini T yapin
        ogrencimap = MapDepo.ogrenciyeYeniSubeAta(ogrencimap, 105, "T");

        System.out.println(ogrencimap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Dem-12-D-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-T-TM,
        106=Fatma-Han-10-K-Soz,
        110=Fatih-Yan-10-T-MF}
         */

    }
}

