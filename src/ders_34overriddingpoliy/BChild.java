package ders_34overriddingpoliy;

public class BChild extends AParent{
    public void method1() {
        System.out.println("child class method 1");
    }
    public void method2(int a) {
        System.out.println("child class method 2");
        //overriding miras iliskisi olan iki clas arasi olur.
        //hem meth ismi hem signiture ayni olmali
    }
    public void method2(String isim) {
        System.out.println("child  class method 1");
    }

    @Override
    public void method3() {
      //  super.method3();
        // overridding varsa parent ve chils claslardaki
        //overridding ve overriddingmethodlarda sadece biri calisirn
    //eger ikisi birden calstrilmak istenirse super yazilir
      //overide yazarsa parent class method silinirse cte verir
     //override yaznazsa parentteki methd silinsede birsey olmaz

    }
}
