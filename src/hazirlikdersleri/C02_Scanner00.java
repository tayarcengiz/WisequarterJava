package hazirlikdersleri;

import java.util.Scanner;

public class C02_Scanner00{
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dairenin yaricapini gir");
        double yaricap=scan.nextDouble();
        double daireAlani=yaricap*yaricap*3.14;
        System.out.println("dairenin alani:" +daireAlani);


    }

}
