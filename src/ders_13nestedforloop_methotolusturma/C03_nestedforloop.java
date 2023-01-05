package ders_13nestedforloop_methotolusturma;

public class C03_nestedforloop {
    public static void main(String[] arg) {

        //1 den 4 e carpim toblosu hazirla   // dis dongu satirlari kontrol eder
        //ic dongu her satirdaki degerleri kontrol eder
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");

            }
            //ic dongu bitince alt satira gecme
            System.out.println("");
        }

/*
                1 2 3 4 5
                2 4 6 8 10
                3 6 9 12 15
                4 8 12 16 20
                5 10 15 20 25
 */
    }


}
