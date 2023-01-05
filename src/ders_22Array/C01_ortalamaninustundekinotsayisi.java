package ders_22Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ortalamaninustundekinotsayisi {
    public static void main(String[] args) {
        //ogretmenden notlari alip bir liste olusturun, ogretmen 100 den buyuksayi ya basip bitirince
        // kac kisnin ortalamasinin uzerinde not aldigini yazdirin
        List<Double> notlar =listeOlustur();
        System.out.println(notlar);
        raporla(notlar);



      //  21.0, 36.0, 58.0, 41.0, 36.0, 94.0]
        //girilen not sayisi:6
        //girilen notlarin ortalamasi:47.666666666666664
        //ortamauzerindekinot alan ogrenci sayisi:2

    }
    public static void raporla(List<Double> notlar){
        int ogrencisayisi=notlar.size();
        double notlartoplami=0.0;
        double sinifortalamasi=0.0;
        int ortalamaustundekiogrencisayisi=0;
        //notlar toplamini bulalim
        for (int i = 0; i < notlar.size(); i++) {
            notlartoplami+= notlar.get(i);
        }
        sinifortalamasi=notlartoplami/ogrencisayisi;
        //ortalama ustundeki ogrenci sayisi
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>sinifortalamasi){
                ortalamaustundekiogrencisayisi++;
            }
        }
        // rapor icin istenenleri yazdiralim
        System.out.println("girilen not sayisi:"+ ogrencisayisi+
        "\ngirilen notlarin ortalamasi:"+sinifortalamasi+
            "\n ortamauzerindekinot alan ogrenci sayisi:"+ ortalamaustundekiogrencisayisi);

    }
    public static List<Double>  listeOlustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        Double girilennot=(double)5;

        while (girilennot<=100){

            System.out.println("Lutfen listeye eklemek icin isim giriniz" +
                    "\nBitirmek icin 100 den buyuk sayi yazin");
            girilennot= scan.nextDouble();

            if (girilennot<100){
                notlar.add(girilennot);
            }

        }

        return notlar;
    }
}






