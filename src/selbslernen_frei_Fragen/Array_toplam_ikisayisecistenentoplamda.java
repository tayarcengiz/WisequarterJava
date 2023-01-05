package selbslernen_frei_Fragen;

public class Array_toplam_ikisayisecistenentoplamda {
    // verilen arrayde iki sayiciftinin toplami istenen sayi ile esitse bu cifti yazdir
    //arr[]={3,5,-1,9}  istenen=8  output=3,5   -1,8
    public static void main(String[] args) {

        int[] arr={5,7,-6,4,2,15,3,8,1};
        int istenentoplam =9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i]+arr[j])== 9){
                    System.out.println("birinci sayi:"+ arr[i]+"   ikinci sayi:"+arr[j]);
                }

            }
        }
    }
}
