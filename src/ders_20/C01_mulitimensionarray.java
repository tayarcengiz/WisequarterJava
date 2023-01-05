package ders_20;

import java.util.Arrays;

public class C01_mulitimensionarray {
    public static void main(String[] arg) {

        int[][] arr ={{4,3,2},{1,2},{5,6,7},{},{3,6,8,0}};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//[5,6,7] length3
        System.out.println(arr[1]);// [4,3,2,1] direk yazdirilamaz java referansini yazdiririr.[I@3b6eb2ec
        System.out.println(Arrays.toString(arr[1]));//[1,2]
        //tum arrayi yazdirma
        System.out.println(Arrays.deepToString(arr));
       // System.out.println(arr[3][0]);//[[4, 3, 2], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]



    }
}
