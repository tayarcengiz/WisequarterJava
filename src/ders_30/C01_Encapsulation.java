package ders_30;

public class C01_Encapsulation {
    public static void main(String[] args) {
        AEncapsuleclass pers1=new AEncapsuleclass();
        //pers1.hemsireadresi="Ankara";// private oldugundan gorulemez,
        //pers1.hemsireismi="Yildiz Yiliz";
       // pers1.getHastaneismi()="Java Hastanesi";//deger atamasi yapamayiz
       // prive yaptik artik ulasilamaz pers1.hemsireadresi="Ankara";
       //private oldu artik ulasilamaz pers1.hemsireismi="Yildiz hemsire";
        pers1.setHemsireadresi("Istanbul"); // setter ile deger atadik
        // ama baska yolla hemsire ismine deger atayabiliriz=setter

        pers1.setHastaucreti(500);// sadece atariy ama yazdiramayiz bil
        System.out.println(pers1.getHastaneismi()); //Yildiz hastanesi
        System.out.println(pers1.getHemsireismi());// Ayse hemsire



        // getter ve stter mezhodlari bazendeerisimi sinirlandirmak icin degil kullanicilarin
        // #islevinizi anlamasi icin de kullanilir.

    }
}


