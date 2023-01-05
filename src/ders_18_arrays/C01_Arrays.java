package ders_18_arrays;

public class C01_Arrays {
    public static void main(String[] arg) {

        int [] arr1={2,4,6,8,10};
        //arrayin bir elementine ulasmak istersek
        System.out.println(arr1[2]);  //6
        arr1[3]=20;
        System.out.println(arr1[3]);//20
        System.out.println(arr1.length);//5
        System.out.println(arr1[arr1.length-1]);//10
        //arrayin tum elementlerini yazdirma:
        for (int i=0; i<arr1.length ;i++){
            System.out.print(arr1[i]+" ");
        }
        //arrayin uzunlugu sonra degistirilemez
        //arrayde olmayan indexe atma yapamayiz.
        arr1[5]=35;// calistirinca 5.index yok hatasi verir.

    }
}
