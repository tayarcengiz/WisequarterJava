package ders_39AbstractClass;

public abstract class Araba {
    //Araba clasini inherit eden tum classlar motor,kasa,teker methodlarini over etmek zorunda kalsin istiyoruz.
    //ancak abs klima methodlari zorunlu degil opsiyon olsun
    public abstract void motor();



    public abstract void kasa();


    public abstract void tekerlek();

    public void abs(){
        System.out.println("abs guvenlikartirir");
    }
    public void klima(){
        System.out.println("klima konfor artirir");
    }


}
