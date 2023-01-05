package ders_32_Inheritansconstracter;

public class GAvcikuslar extends FKuslar{
    public static void main(String[] args) {

        GAvcikuslar avci1=new GAvcikuslar();

        FKuslar avci2= new GAvcikuslar();
        EHayvanlar avci3=new  GAvcikuslar();
        /*
        bir child class da obje olusturmak icin child class constructor u kullanilir-
        ama data turunu o objenin bagli oldugu claslardan secebiliriz
        eger constructor ve data turu farkli secilirse bu durumda class uyesi olan variable ve
        methodlar farkli davranislar gosterirler-
         */
    }
}
