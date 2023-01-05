package ders_19;

import java.util.Arrays;

public class C01 {
    public static void main(String[] arg) {
        //verilen tum elementleri saga kaydirin

        int[] arr ={4,5,6,7};
        arr=sagakaydir(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagakaydir(int[] arr){
        int boskova=arr[arr.length-1];//son elementi bos kovaya koyduk
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];

        }
        arr[0]=boskova;
        return arr;


    }

}

