package hazirlikdersleri;

import java.util.Random;
import java.util.Scanner;

public class GrupCalismasiPiyango {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("uc basamakli bir sayi gir");
        int sans = scan.nextInt();
        Random r = new Random();
        int r1 = r.nextInt(100);
        int kazandiginizPara=0;

        int s1 = sans%10;
        int s2 = (sans/10)%10;
        int s3 = (sans/100)%10;

        int n1 = r1%10;
        int n2 = (r1/10)%10;
        int n3 = (r1/100)%10;

        if(sans == r1){
            kazandiginizPara = 10000;

        } else if ((s1 == n1 && s2 == n3 && s3 == n2) || // uc basamak aynı
                (s1 == n2 && s2 == n1 && s3 == n3) || // uc basamagın dogru olması durumunda
                (s1 == n2 && s2 == n3 && s3 == n1) || // dogru yerde olma durumu gözardı edilmiş
                (s1 == n3 && s2 == n1 && s3 == n2)||
                (s1 == n3 && s2 == n2 && s3 == n1) ) {
            kazandiginizPara = 3000;


        } else if ((s1 == n1 || s1 == n2 || s1 == n3) ||
                (s2 == n1 || s2 == n2 || s2 == n3)||
                (s3 == n1 || s3 == n2 || s3 == n3) ) {
            kazandiginizPara = 1000;

        }else {
            kazandiginizPara= 0 ;

        }
        System.out.println("kullanıcının tahmini = "+ sans +" ve "+ " bilgisayarın belirledigi sayi = "+r1  );
        System.out.println("");
        System.out.println("kazandiginiz para = "+ kazandiginizPara);


    }
}