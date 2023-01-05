package ders_34overriddingpoliy;

public class DChild extends CParent{
   //child parenti sinirlandiramaz
    //child ya ayni yada daha genis olmalidir.

    public void method1(){

    }

    //privet ve static methdlar override edilemez-
    public void method2(){

    }
    private void method3(){
    }
    // return typ methos signiturena dahil degil farkli secilebilir
    //ancak return typ void veya primitive ise ayni olmalidir
    public void method4(){

    }
    public Integer method5(){
        return 5;
        //retur parentin return inin
        //



        // child i olmalidir
    }
}
