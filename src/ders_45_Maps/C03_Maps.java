package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {
        //ogrenciler Mapinde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim.
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        // System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF, 105=Ayse-Cem-11-M-TM, 106=Fatma-Han-10-K-Soz}
     String subeAdi="H";
     MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeAdi);
        ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ogrenciMap.put(101,"Adem-Fan-12-T-Soz");

        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeAdi);
        /*
        isim soyisim sinif
                ------------------------------
        AliCem11
        AyseCan10
        HasanYan12
 */
    }
}
