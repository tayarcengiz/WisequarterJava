package ders_19;

import java.util.Arrays;

public class C05BinarySearch {
    public static void main(String[] arg) {
        int [] arr ={1,8,9,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));//7
        System.out.println(Arrays.binarySearch(arr,5));//-2
        System.out.println(Arrays.binarySearch(arr,1));//0
        System.out.println(Arrays.binarySearch(arr,9));//-10
        //binary in dogru sonuclar verebilmesi icin oncelile sort method kullanilmalidir.
        //sor suz arama yanlıi sonuc verebilir.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 1, 2, 3, 5, 7, 8, 8, 9]
        System.out.println(Arrays.binarySearch(arr,8));//6
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,1));//1
        System.out.println(Arrays.binarySearch(arr,9));//8

        //array de olmayan bir eleman artirsak
        // java once olsaydi yerini tahminen bulur.ve - ile gosterir
        System.out.println(Arrays.binarySearch(arr,-3));//-1
        System.out.println(Arrays.binarySearch(arr,4));//-5
        System.out.println(Arrays.binarySearch(arr,10));//-10





    }
}
