package ders_37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C1_CheckedException {
    public static void main(String[] args) {
       //IOexception ince gozenek elek kemen her hatayi yakalar
        //FileNotFound ise orta gozenek en uste bu elek konabilir.

        String dosyayolu="src/ders_36_checkedException/Deneme.txt" ;
        int k=0;
        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
            while ((k= fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis veya arizali");
        } catch (IOException e) {
            System.out.println("Dosya okuma ve yazma ile ilgili bir sorun var");
        }
      /*
      Bir kod calisirken birden fazla exception olusma ihtimali varsa
           bu kodu calisir hale getirmek icin 4 ihtimal vardir
           1- herbir exception ic ice try-catch bloklari kullanmak
           2- Bir tane try blogu birden fazla catch blogu olusturmak
           3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
           4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
              onu kullanmak
         */
        /*
          2.ve 3.ihtimallerde olusmasi muhtemel exception'lar arasinda
          parent-child iliskisi olup olmadigi kontrol edilmelidir.
          aralarinda parent-child iliskisi yoksa
          exception'lari istedigimiz sirada yazabiliriz
          Ancak parent-child iliskisi varsa
          once child, sonra parent yazilmalidir
          aksi takdirde parent daha kapsamli oldugundan tum exception'lari yakalar
          ve asagidaki child exception islevsiz kalir.
          java bu durumu kabul etmez, CTE verir.
       */

    }
}
