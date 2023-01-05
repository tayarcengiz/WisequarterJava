package ders_29Accesmodifiler;

public class C05_Accesm {
    public static void main(String[] args) {

        C04_accemodifier obj=new C04_accemodifier();
        System.out.println(obj);
        obj.isim="Tugay";
        System.out.println(obj.isim);//Tugay
        //obj.sayi = privat variablelere baska clastan ulasilamaz C04 de oldugu icin ulasilamaz.kendi clas i harici ulasilamaz
        C04_accemodifier obj2=new C04_accemodifier();
        System.out.println(obj2.isim);//Ali    C04 den deger atanmamais Default degeri ilk halini aldi


    }
}
