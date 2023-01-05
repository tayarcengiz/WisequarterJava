package ders_26passbyValue;

public class C07 {
    public static void main(String[] args) {
        String str ="Java Candir";

        str=str.toUpperCase();
        System.out.println(str);
        //immutable classlardan olusturuln bir objenin degeri degistirilemez.
        //eger atama yaparsak java degerii degistirmez bunun yerine yeni bir obje olusturur ve buna yeni atadiginiz
        // degeri atar. eski obje garbice operatoru tarafindan silinmeyi bekler-


    }
}
