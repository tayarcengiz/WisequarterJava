package selbslernen_frei_Fragen;

import java.util.Arrays;

public class Q3_string {
    // string=heysiri  output=bysiri
    //2, b heysiri yi arr ye ata
    public static void main(String[] args) {
        String str="Heysiri";
        String[] arrstr= str.split("y");
        System.out.println(Arrays.toString(arrstr));//[He, siri]
        arrstr[0]="Bye";
        System.out.println(Arrays.toString(arrstr));//[Bye, siri]
        for (int i = 0; i < arrstr.length; i++) {
            System.out.print(arrstr[i]);//   Byesiri
        }

    }
}




















/*
 String istenen=str.replace("Hey","By");
        System.out.println(istenen);
 */