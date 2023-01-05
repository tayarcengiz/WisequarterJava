package ders_47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",6);
        mp1.put("C",6);

        if(mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);

        }
        System.out.println(mp1);//{A=5, B=6, C=9}
        if(!mp1.containsKey("D")) {
            mp1.put("D", 11);
            System.out.println(mp1);//{A=5, B=6, C=9, D=11}
        }


    }              //  ü++++üü+ü-----______ääö.,!"§$§"/7//²³1{[[[]][[]],,,,Üüüü++~

}
