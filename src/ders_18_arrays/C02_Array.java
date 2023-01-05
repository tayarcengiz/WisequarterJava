package ders_18_arrays;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] arg) {

        String [] arr ={"Ali", "Ulus", "Nesrin"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");//Ali Ulus Nesrin


        }
        System.out.println(arr);//[Ljava.lang.String;@1a407d53 java referansini yazdirir
        System.out.println(Arrays.toString(arr));//[Ali, Ulus, Nesrin]



    }
}
