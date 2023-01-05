package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04 {
    public static void main(String[] args) {
        //nosu 105 den buyuk kisileri list ile dondur
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        int basNo=103;
        int bitNo=107;

        List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);//[Ali Cem 11 H, Ayse Can 10 H, Ayse Cem 11 M, Fatma Han 10 K]
        // [Ali Cem 11 H, Ayse Can 10 H, Ayse Cem 11 M, Fatma Han 10 K, Tugay Cil 12 K]
          /*
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10-H-MF,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}

           */
    }
}
