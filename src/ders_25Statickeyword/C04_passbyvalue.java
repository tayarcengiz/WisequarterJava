package ders_25Statickeyword;

public class C04_passbyvalue {
    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(indirimuygula(fiyat));//90
        System.out.println(fiyat);//100

    }
    public static double indirimuygula(double fiyat){
        fiyat= fiyat * 0.9;
        return fiyat;

    }
}
