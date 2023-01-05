package ders_33Overridding;

public class Corolla extends BToyota{
    String model ="Corolla";
    String uretimyeri ="Turkiye";
    int yil=2023;

    public static void main(String[] args) {
        //obje olusturulurken data ayni classtan ise
    Corolla corolla1=new Corolla();
        System.out.println(corolla1.model);// corolla
        System.out.println(corolla1.uretimyeri);//corolla
        System.out.println(corolla1.yil);//corolla
        System.out.println(corolla1.marka);//btoyota
        System.out.println(corolla1.motor);//Araba
        System.out.println(corolla1.plaka);//Araba
        System.out.println(corolla1.yakit);//BToyota


    BToyota corolla2=new Corolla();
    //obje olusturulurken constructor farkli ise variable
        // degeri bulmak iicn geri gelmez grundparente dogru
        // gider bulamazsa cte verir
        System.out.println(corolla2.model);// btoyota
        System.out.println(corolla1.uretimyeri);//CTE btoyota dan baslar
      // geri glmez gparente gider
        System.out.println(corolla2.yil);//BToyota
        System.out.println(corolla2.marka);//btoyota
        System.out.println(corolla2.motor);//Araba
        System.out.println(corolla2.plaka);//Araba
        System.out.println(corolla2.yakit);//BToyota


    Araba corolla3=new Corolla();
      //  System.out.println(corolla3.model);//
       // System.out.println(corolla3.uretimyeri);//CTE btoyota dan baslar
      //Araba clasinda olmayan cte olur
       // System.out.println(corolla3.yil);//
     //   System.out.println(corolla3.marka);//
        System.out.println(corolla3.motor);//Araba
        System.out.println(corolla3.plaka);//Araba
        System.out.println(corolla3.yakit);//Araba
     // varsa Araba clasindan yolksa CTE verir.

     BToyota toyota1 =new BToyota();
     //Btoyota classtan baslar yukariya gider
       System.out.println(toyota1.marka);//BToyota
       System.out.println(toyota1.model);//BToyota
       System.out.println(toyota1.motor);//Araba
       System.out.println(toyota1.plaka);//Araba
       System.out.println(toyota1.yakit);//BToyota
       System.out.println(toyota1.yil);//btyota

      Araba toyota2=new BToyota();
       // System.out.println(toyota2.marka);//cte
       // System.out.println(toyota2.model);//cte
        System.out.println(toyota2.motor);//Araba
        System.out.println(toyota2.plaka);//Araba
        System.out.println(toyota2.yakit);//Araba
       // System.out.println(toyota2.yil);//cte

        Araba araba=new Araba();
        System.out.println(araba.motor);//Araba
        System.out.println(araba.plaka);//Araba
        System.out.println(araba.yakit);//Araba



    }

}
