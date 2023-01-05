package ders_44_Maps;

import java.util.Map;

public class C02_MAPS {
    public static void main(String[] args) {

        Map<Integer,String> ogrencimap=MapDepo.ornekMapOlustur();
        ogrencimap.put(105,"Hsan-Can-11-K-MF");
        ogrencimap.put(108,"Hikmet-Han-10-TM");
        System.out.println(ogrencimap);
        /*
        {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-MF,
        105=Hsan-Can-11-K-MF, 106=Fatma-Han-10-K-Soz, 108=Hikmet-Han-10-TM}
         */
        System.out.println(MapDepo.isimSoyisimDondur(ogrencimap,108));//Hikmet Han

        //104 nolu ogrencinin subesini K yapmak:methodda istenen key map de varsa degistirip mapi geri dondurelim
        int ogrenciKey=105;
        String yeniSube="N";
        ogrencimap= MapDepo.ogrenciyeYeniSubeAta(ogrencimap,ogrenciKey,yeniSube);
        System.out.println(ogrencimap);


    }
}
