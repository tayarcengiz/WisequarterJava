package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {
        //ogrenci map inden numara isim ve soyisim degerlerini yazdiralim
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();


        // Ogrenci Map'inden Numara, isim ve soyisim degerlerini yazdiralim
        ogrenciMap.put(110,"Suleyman-Sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");
        MapDepo.numaraIsimSoyIsimYazdir(ogrenciMap);
        /*
        101 Ali Can\ß??`CcCv´`.,;:ÖÄ'#p^1124üÜ      üü+
        102 Veli Cem
        103 Ali Cem
        104 Ayse Can
        105 Sule Karaca
        106 Fatma Han
        110 Suleyman Sah
   */


    }

}
