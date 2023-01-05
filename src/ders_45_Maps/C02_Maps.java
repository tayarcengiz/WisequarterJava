package ders_45_Maps;

import ders_44_Maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {
        //ogrenciler Mapinde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim.
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
       // System.out.println(ogrenciMap);//{101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF, 105=Ayse-Cem-11-M-TM, 106=Fatma-Han-10-K-Soz}

        Set<Integer> ogrencikeyset=ogrenciMap.keySet();// bir mapdeki key leri Set olarak dondurur.
        System.out.println(ogrencikeyset);//[101, 102, 103, 104, 105, 106]
        Collection<String> ogrenciValueCollection=ogrenciMap.values();
        System.out.println(ogrenciValueCollection);//[Ali-Can-10-H-MF, Veli-Cem-11-M-Soz, Ali-Cem-11-H-TM,
        // Ayse-Can-10-H-MF, Ayse-Cem-11-M-TM, Fatma-Han-10-K-Soz]
        System.out.println(ogrenciValueCollection.size()); // 6

    }
}
