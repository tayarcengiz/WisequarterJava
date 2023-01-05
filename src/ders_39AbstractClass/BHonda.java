package ders_39AbstractClass;

public abstract class BHonda extends Araba{
    //Abstract clasi parent ettik methodlari over etmek veya proje yapimiz gerektiriyorsa bu clasida abstrack yapmaliyiz

    public void marka(){
        System.out.println("marka:Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelteknoloji(){
        System.out.println("tum Hondalar ozelteknoloji kullanir");
    }


}
