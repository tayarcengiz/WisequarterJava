package ders_45_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        //verilen bir cumlede kullanilan herbir harfi ve o harfin kullanim miktarini
        //A=5, B=3 gibi yazdirin
        String str ="Javayi balonu patlatmadan bitirelim";
        //J=1  ,a=7, v=1, y=1 ....
        String[] harfler =str.split("");
       // System.out.println(Arrays.toString(harfler));
        //[J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i,m]
        Map<String,Integer> kullanimmiktarimap= new TreeMap<>();
        int sayac=1;
        for (int i = 0; i < harfler.length; i++) {
            //ele aldigimiz harfin daha once mape alinip alinmadigini kontrol edelim.
            if (kullanimmiktarimap.containsKey(harfler[i])) {
                continue;
            } else {
                //kod buraya gelmisse kullanilmamistir.
                for (int j = i + 1; j < harfler.length; j++) {
                    if (harfler[j].equals(harfler[i])) {
                        sayac++;
                    }
                }
                //sayma islemi bitti bunu map e ekleyelim.
                kullanimmiktarimap.put(harfler[i], sayac);
                sayac = 1;
            }
        }
        System.out.println(kullanimmiktarimap);
        //{ =3, J=1, a=7, b=2, d=1, e=1, i=4, l=3, m=2, n=2, o=1, p=1, r=1, t=3, u=1, v=1, y=1}
    }
}
