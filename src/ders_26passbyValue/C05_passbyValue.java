package ders_26passbyValue;

import java.util.Arrays;

public class C05_passbyValue {
    public static void main(String[] args) {

        //main meth da verilen arrayin uzunlugundan 2 fazla olan ve elementlerin tamami 5 olan
        // yeni bir array olusturup deger olarak sayilar arrayine atayin ve sayilar arrayini yazdirin.

        int[] sayilar ={3,4,5};
        arrayeyenidegerAta(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }

    public static void arrayeyenidegerAta(int[] sayilar){
        int[] yeniArray = new int[sayilar.length+2];
        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i]=5;
        }
        sayilar=yeniArray;
        System.out.println("methoddaki sayilarin son hali"+Arrays.toString(sayilar));
    }
}
