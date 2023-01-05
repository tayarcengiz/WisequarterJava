package ders_32_Inheritansconstracter;

public class DCamry extends BToyota {
    DCamry(String pc){
        super( "Deniz");
        System.out.println("strinp parametreli Campry");
    }
    DCamry(){

    }
    public static void main(String[] args) {
        DCamry camry2=new DCamry("Celal");


        System.out.println("-----------------------------");
        DCamry camry=new DCamry();
       // Parametresiz Araba constructor
        //Parametresiz Toyota Constructor
    }

}
