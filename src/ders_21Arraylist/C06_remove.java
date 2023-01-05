package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3, 5, 3, 5, 2, 1, 2, 5, 7, 6};
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);// 4 silindi
        //index kabul edip istedigimiz elementi obje olarak girip silmek icin onceden tanimlamak gerekir.

        Integer silinecekobje=4;
        sayilar.remove(silinecekobje);
        System.out.println(sayilar);//[1, 2, 5, 3, 5, 3, 5, 2, 1, 2, 5, 7, 6]

        //tum 3 leri sildirin.
        silinecekobje=3;

        while (sayilar.contains(silinecekobje)){
            sayilar.remove(silinecekobje);
        }
        System.out.println(sayilar);//[1, 2, 5, 5, 5, 2, 1, 2, 5, 7, 6]
        // silinecek obje listede yoksa silmezayni listeyi verir false donurur.hata vermez.

          // sayilar.remove(20)// ama bu sefer 20. index yok hatasi verir

    }


}
