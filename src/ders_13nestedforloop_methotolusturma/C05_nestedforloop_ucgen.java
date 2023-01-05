package ders_13nestedforloop_methotolusturma;

public class C05_nestedforloop_ucgen {
    public static void main(String[] arg) {
       /* nested forloop kullanarak
       1
       12
       123
       1234     yazdirin
        */
        for(int i=1;i<=5; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
