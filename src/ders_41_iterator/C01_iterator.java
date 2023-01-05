package ders_41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        Iterator it1=sayilar.iterator();
        Iterator it2=sayilar.iterator();
        //tum elementleri iterator kullanarak yazdiralim.
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());

        while (it1.hasNext()){

            System.out.println(it1.next());
        }while (it1.hasNext()){

            System.out.println(it2.next());
        }




    }



}
