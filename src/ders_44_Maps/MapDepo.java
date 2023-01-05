package ders_44_Maps;

import java.util.*;


//ogrenci map olusturup bize donduren method olusterun
public class MapDepo {

        // ogrenci map olusturup bize donduren bir method olusturun

        public static Map<Integer, String> ornekMapOlustur() {
            Map<Integer, String> ogrenciMap = new HashMap<>();
            ogrenciMap.put(101, "Ali-Can-10-H-MF");
            ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
            ogrenciMap.put(103, "Ali-Cem-11-H-TM");
            ogrenciMap.put(104, "Ayse-Can-10-H-MF");
            ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
            ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

            return ogrenciMap;
        }

        public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {
       /*
           {
           101=Ali-Can-10-H-MF,
           102=Veli-Cem-11-M-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10-H-MF,
           105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}
           ogrenciKey=105
         */

            String ogrenciValue = ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"

            String[] valueArr = ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]

            String isimSoyisim = valueArr[0] + " " + valueArr[1]; // Ayse Cem

            return isimSoyisim;
        }

        public static String isimsoyisimyazdir(Map<Integer, String> ogrenciMap, int ogrencikey) {
            String ogrenciValue=ogrenciMap.get(ogrencikey);
            String[] valueArr=ogrenciValue.split("-");
            String isimsoyisim=valueArr[0]+" "+valueArr[1];// Ayse, Cem
            return isimsoyisim;
        }


        public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrencimap, int ogrenciKey, String yeniSube) {
            // ogrenci key map'de var mi ? 104


            if (ogrencimap.containsKey(ogrenciKey)) {
                // istenen Key varsa, update edip yeni map'i dondurecegiz

                String istenenKeyinValuesu = ogrencimap.get(ogrenciKey); // Ayse-Can-10-H-MF
                String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
                // yeni sube degerini atayalim
                istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]

                String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                        istenenKeyvalueArr[1] + "-" +
                        istenenKeyvalueArr[2] + "-" +
                        istenenKeyvalueArr[3] + "-" +
                        istenenKeyvalueArr[4];
                ogrencimap.put(ogrenciKey, istenenKeyinYeniValesu);
            }

            return ogrencimap;

        }

        public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
            Collection<String> ValueCollection =ogrenciMap.values();
            System.out.println(("isim soyisim sinif"));
            System.out.println("------------------------------");
            for (String eachValue:ValueCollection){
                String[] valuearr =eachValue.split("-");
                if (valuearr[3].equals(subeAdi)){
                    System.out.println(valuearr[0]+" " +valuearr[1] +" " +valuearr[2]);
                }

            }
        }

        public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
            Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();
           //hem key hem valu lazim keyset olusturduk
            List<String> isimListesi=new ArrayList<>();
            //key deg tek tek elden gecirip istenen araligi bulalim
            String value;
            String[] valueArr;
            String istenenIsim;
            for (Integer eachkey:ogrenciKeySeti){
                if (basNo<=eachkey && eachkey<=bitNo){
                    value=ogrenciMap.get(eachkey);//
                    valueArr=value.split("-");
                    //valuyuparcalara ayiralim
                    istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[2]+" "+valueArr[3];
                    isimListesi.add(istenenIsim);

                }
            }
            return isimListesi;
        }

    public static void numaraIsimSoyIsimYazdir(Map<Integer, String> ogrenciMap) {
            Set<Integer> keySeti=ogrenciMap.keySet();
            String value;
            String[] valueArr ;

            for (Integer eachKey:keySeti){
                value=ogrenciMap.get(eachKey);
                valueArr =value.split("-");
                value=ogrenciMap.get(eachKey);
                valueArr=value.split("-");// [Ayse, Can, 10, H, MF]

                System.out.println(eachKey + " " + valueArr[0] +" "+ valueArr[1]);

            }

    }

   // public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {


}

