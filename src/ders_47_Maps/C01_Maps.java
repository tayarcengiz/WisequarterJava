package ders_47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",57);
        System.out.println(mp1.putIfAbsent("D",9));//null  d ve 9 eklenir onceki deger yoksa null doner
        System.out.println(mp1.putIfAbsent("D",15));//9 , eski atanan deger yoksa ekle dedik,9 degeri kalir,yeni deger eklenmez
        System.out.println(mp1);//{A=5, B=6, C=57, D=9}

        Map<Integer,String> mp2=new HashMap<>();
        mp2.put(7,"K");
        mp2.put(6,"M");
        mp2.put(578,"W");
        System.out.println(mp2.putIfAbsent(99,"K"));



    }
}
