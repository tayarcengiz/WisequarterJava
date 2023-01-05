package ders_32_Inheritansconstracter;

public class BToyota extends Araba {
    BToyota(){
        System.out.println("Parametresiz Toyota Constructor");
    }
    BToyota(int pt){
        System.out.println("Parametreli Toyota Constructor");
    }
    BToyota(String pt){
        super("Mehmet");
        System.out.println("Strings parametreli toyota");

    }
}