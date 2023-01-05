package ders_36_checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis =new FileInputStream("src/ders_36_checkedException/Deneme.txt");
        //bilgisayarimizdan boylece bir dosyayi okuyabiliriz.
        //dosya yolunu girmeliyiz
        //Checked Exception ile olsi sorun kodlarini yazdigimizda hata ihtimali old gorur kodun altini
        // kirmizi olarak cizer. kirmizi yi kaldirmak icin iki yontem vardir. 1: try catch ile handle etmek
        // 2: java ya farkindayiz ama koda guvendigimizi ve calismaya devam etmesini istedigimizi soyleriz.
        // bunun icin curly braces arasina throws keyword yazabiliriz.-


    }
}
