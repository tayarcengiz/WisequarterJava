package ders_14_method;

public class C06_Soru {

    public static void main(String[] args) {
        //buyul kucuk harf ayarlayin

        String isim ="OMER";
        String soyisim="kesen ";
        System.out.println(isimsoyisimDuzenle(isim,soyisim));
        System.out.println(isimsoyisimDuzenle( "HEYSEM","reNKOGLu"));



    }
    public static String isimsoyisimDuzenle(String isim, String soyisim){

        String yeniisimsoyisim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase()+
                " " +
                soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        return yeniisimsoyisim;
    }
}
