package ders_20;

public class C04_MDA_ciftsayiadedi {
    public static void main(String[] arg) {
        //verilen iki katli integer arraydeki cift sayi adedini bulan array yazin
        int[][] arr={{4,6},{3,5,8},{1,0,4}};
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]  %2 ==0){
                    sayac++;

                }

            }

        }
        System.out.println("arraydeki cift sayi adedi:"+sayac); //5

    }
}
