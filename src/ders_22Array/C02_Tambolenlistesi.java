package ders_22Array;
import java.util.ArrayList;
import java.util.List;
public class C02_Tambolenlistesi {
    public static void main(String[] args) {
        // kul dan pozitif tam sayi al o tam sayilari bolen tum pozitiftamsayilari gosteren
        //bir liste olarak bize donduren method olustur.
        int input=28;
        System.out.println(tambolenlerlistesiolustur(input));
    }
    public static List<Integer> tambolenlerlistesiolustur(int input){
        List<Integer> tambolenlerlistesi=new ArrayList<>();
        for (int i = 1; i < input; i++) {
            if (input%i ==0){
                tambolenlerlistesi.add(i);
            }
        }
        return tambolenlerlistesi;
    }
}
