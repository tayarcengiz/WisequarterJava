package ders_21Arraylist;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class C08_kullaniciyalisteolusturma {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        System.out.println(listeOlustur());

    }

    public static List<String>  listeOlustur(){

        List<String> isimler= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        String girilenIsim="";

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Lutfen listeye eklemek icin isim giriniz" +
                    "\nBitirmek icin q'ya basin");
            girilenIsim= scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }

        }

        return isimler;
    }
}
