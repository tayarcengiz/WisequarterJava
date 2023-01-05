package ders_41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03 {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        Iterator it1=sayilar.iterator();
        Iterator it2=sayilar.iterator();
        while ((it1.hasNext())){
            //Integer element=();

        }


        //iterator kullanarak 25 35 arasi sayilari silin
    }

}
