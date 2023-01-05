package ders_19;

import java.util.Arrays;

public class C07Arrayeyenielementekleme {
    public static void main(String[] arg) {

        int[] arr={2,4,6};  // bu arraye 8 i 4. eleman olarak eleman  eklemek
        //once [ 2, 4, 6, 8,] yeni array olusturup arr ye atariz.
        //yeni aray olusturalim uzunlugu eski arrayin 1 fazlasi olacak
        int[] arr2=new int[arr.length+1];//
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 0]
        arr2[arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 8]
        arr=arr2; // arr nin son hali
        System.out.println("Arrayin son hali:"+Arrays.toString(arr));//[2, 4, 6, 8]






    }
}
