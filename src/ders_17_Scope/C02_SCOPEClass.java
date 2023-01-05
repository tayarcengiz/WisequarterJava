package ders_17_Scope;

public class C02_SCOPEClass {
    //class level variableler genelde en ustte methodlarin disinda olusturulur.
    // class variable deger atamadan da kullanilabilir.
    static String hastaneismi="Yildiz hastanesi";
    static int hastasayisi=23453;
    static String bashekimismi;
    String personelismi="isim henuz girilmedi";
    String personeltelefonu="telefon girilmedi";
    int personelyasi;




    public static void main(String[] args){
        System.out.println(hastaneismi);// yildiz hastanesi
        System.out.println(bashekimismi);//Null
        //System.out.println(personel ismi);// static olmadigi icin main met da kullanilamaz
        // deger atanmazsa java bu variablelere data turune gore default degerler atar
        //sayisal icin 0,,, boolean icin :false,, char: icin '' hiclik ObjelerString dahil: Null



    }

    public static void method1(){
        System.out.println(hastasayisi);
        hastasayisi++;
        //System.out.println(personelismi);// main disi staticte olmaz


    }
    public void method2(){
        System.out.println(hastaneismi);// Yildiz hastanesi
        System.out.println(hastasayisi);
        System.out.println(personelismi);//isim girilmedi
        System.out.println(personelyasi);// 0 deger girilmedigi icin



    }
}
