package ders_18_arrays;

public class C04Elementleritopla {

    public static void main(String[] arg) {

        int[] arr ={3,-3,5,-7,-6,1,-2};
        int toplam =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam +=arr[i];

            }

        }
        System.out.println(toplam); //9
        System.out.println(pozitifelementleritopla(arr));



    }
    public static int pozitifelementleritopla(int[] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam +=arr[i];

            }

        }
        return toplam;

    }
}
