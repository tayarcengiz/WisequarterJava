package toshibaintellij.socrativeundAhmetPrktik;

import java.util.Arrays;

import static toshibaintellij.socrativeundAhmetPrktik.AsalSayiMethodu.asalSayiMi;
import static toshibaintellij.socrativeundAhmetPrktik.FaktorielMethodu.faktoryelYazdir;
import static toshibaintellij.socrativeundAhmetPrktik.FibonacciSayisiMethodu.fibonaccidenSayiYazdir;
import static toshibaintellij.socrativeundAhmetPrktik.MetniTerscevirMethodu.metniTerseCevir;
import static ders_19.C08ArrayeElemanEklemeMethodu.arrayeelemanekle;

public class MethodCall {
    public static void main(String[] args) {
        System.out.println(asalSayiMi(144));
        System.out.println();
        faktoryelYazdir(12);// 479001600

        int[] abc={3,5,8,9};
        abc=arrayeelemanekle(abc,54);
        System.out.println(Arrays.toString(abc));//[3, 5, 8, 9, 54]

        //System.out.println(hesapMakinasi(3,5,-);
        fibonaccidenSayiYazdir(17);//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
        System.out.println("");
        System.out.println(metniTerseCevir("Bugun Munchene hediye gelecek"));//keceleg eyideh enehcnuM nuguB
        String str="bir kere yaparim ordan methot cagiririm";
        System.out.println(metniTerseCevir(str));//miririgac tohtem nadro mirapay erek rib

        int sayi=24;
        System.out.println(asalSayiMi(sayi));//false


    }
}
