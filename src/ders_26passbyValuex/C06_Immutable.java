package ders_26passbyValuex;

import java.util.ArrayList;
import java.util.List;

public class C06_Immutable {
    public static void main(String[] args) {

        String str = "Java Guzeldir";
        System.out.println(str.toUpperCase());//JAVA GUZELDİR
        System.out.println(str);//Java Guzeldir

        str.toLowerCase();
        System.out.println(str);//Java Guzeldir

        //String immutable old icin methodda yapilan degisiklik kalici degildir.



        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);
        System.out.println(harfler);//[B]
        //yapilan deg list mutable old icin kalicidir.
    }
}



