package ders_31Inheritance;

public class CSuv extends BinekArac{
    public static void main(String[] args) {
        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);//Binek araclarin markasi olur
        System.out.println(suv1.model);//Binek araclarin modeli olur
        System.out.println(suv1.motor);//tum araclar motor kullanir
        System.out.println(suv1.plaka);//tum araclarin plakasi olur
        System.out.println(suv1.yakit);//araclar farkli yakit kullanir
        System.out.println(suv1.yil);//1990
        suv1.hiz("Benzin");//Binek araclarin hizi modele gore degisir
        suv1.teker();//Binek araclarin 4 tekeri olur

        CSuv suv2=new CSuv();
        suv2.marka="Toyota";
        suv2.model="HRV";
        suv2.motor="1,6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="Benzin";
        suv2.yil=2012;
        suv2.hiz(suv2.yakit);

    }
    public void hiz(String yakit){
        if(yakit.equalsIgnoreCase("Benzin")){
            System.out.println("benzinli suvlar max 300 km hiz yapar");
        }else if(yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel Suv lar max 260 km hiz yapar");
        }else if(yakit.equalsIgnoreCase("Hibrit")) {
            System.out.println("Hibrit Suv lar max 220 km hiz yapar");
        }else {
            System.out.println("Yakiti belli degil max hiz soyleyemem");
        }
    }

}
