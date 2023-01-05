package ders_20;

public class C03_MDAenuzunkelime {
    public static void main(String[] arg) {
        //verilen MDA string arraydeki en uzun kelimeyi sunan kelima olusturun.
        String[][] arr={{"ilker"},{"nesrin"},{"yasuf enes"},{"hasan"},{"heysem"},{"adem"}};
            String enuzunkelime=arr[0][0];
        for (int i = 0; i < arr.length; i++) {//autor arrayi kontrol eder
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].length()>enuzunkelime.length()){
                    enuzunkelime=arr[i][j];
                }
            }

        }
        System.out.println("en uzun kelime:"+enuzunkelime);

    }
}
