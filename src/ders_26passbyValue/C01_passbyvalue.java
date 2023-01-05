package ders_26passbyValue;

public class C01_passbyvalue {

    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(fiyat);//100


        fiyat=indirimuygula((fiyat));// simdi degisiklik atannmis olur. 90 yazar.

    }
    //kodlarin anlasilir olmasi icin main m dan diger metotlara parametre
    // gonderirken Variable lar icin ayni ismi tercih ederiz.
    //java metotlar arasi gecis yarken variablenin valusunu degerini gecirir. bu java nin pass by Value tercih
    // etmesinden kaynaklanir.
    //eger methot icindeki degisikligin main icinde gecerli olmasini istersek

    public static double indirimuygula(double ahmet){
        ahmet= ahmet * 0.9;
        return ahmet;  //fiyat= ahmet olabilir sonuc degismez. ama tercih edilmez.anlasilir degil.

    }
}
