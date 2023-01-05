package AyseHocaFragen;

import java.util.Scanner;

public class karekokhesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayi giriniz");
        double sayi=scan.nextInt();
        double karekok=1;
        for (double i = 1; i*i <=sayi ; i+=0.000) {
            karekok=i;
        }
        System.out.printf("%.3f",karekok);


    }
}
