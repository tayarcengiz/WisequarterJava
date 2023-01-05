package ders_13nestedforloop_methotolusturma;

public class C06binom {
    public static void main(String[] arg) {
        /*
        1public static void main(String[] arg) {
        24
        369
        481216public static void main(String[] arg) {
        510152025
                 */
        for(int i=1;i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
          //        1
            //     2 4
            //    3 6 9
            //   4 8 12 16
            //  5 10 15 20 25
        }
    }
}
