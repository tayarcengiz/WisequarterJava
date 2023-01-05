package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C05_Set {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,3,5,3,5,2,1,2,5,7,6};
        List<Integer> sayilar =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        sayilar.set(0,8);
        System.out.println(sayilar);//[8, 2, 4, 5, 3, 5, 3, 5, 2, 1, 2, 5, 7, 6]
        sayilar.set(1,9);
        System.out.println(sayilar.set(1,9));//[8, 2, 4, 5, 3, 5, 3, 5, 2, 1, 2, 5, 7, 6]  ve 9 eski degeri hatirlatir


        // list.set(index,yenideger)methodu istenen indexdeki degeri verdigimiz yeni deger olarak atar


    }
}
