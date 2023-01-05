package hazirlikdersleri;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        //kullanıcıdan ismini al yazdir // 1.adim  scanner objesi olusturulur
        Scanner scan =new Scanner(System.in);
        //kullanıcıya ne istedigimizi soyleyelim
        System.out.println("lutfen isminizi giriniz");
        String kullaniciIsmi=scan.nextLine();
        System.out.println("Girilen Kullanici ismi: "+ kullaniciIsmi);



    }
}