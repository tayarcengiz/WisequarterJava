package ders_14_method;

public class C03_String_Terse_Cevirme {
    //parametre olarak bir stringi kabul edip terse cevrilmis halini method olusturun
    public static void main(String[] args) {


        String input = "Java kod yazdikca guzellesir";
        System.out.println(stringiTerseCevir(input));

    }

    public static String stringiTerseCevir(String input) {

           String tersStr = "";
           for (int i = input.length() - 1; i >= 0; i--) {
               tersStr=tersStr+input.charAt(i);

               System.out.println();

           }
           return tersStr;

    }
}
