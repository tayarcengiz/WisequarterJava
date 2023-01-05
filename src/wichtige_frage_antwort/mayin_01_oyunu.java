package wichtige_frage_antwort;

import java.util.Random;
import java.util.Scanner;

public class mayin_01_oyunu {
     /*
    Kullanicidan oynamak istedigi oyun alaninin buyuklugunu girmesin istensin.
    Kullanici tarafindan girilen buyuklukte bir matris rastgele olusturulsun. Olusturulan matriste sadece 0 ve 1 degerleri vardir.
    0 degerleri temiz; 1 degerleri mayinli bolgeleri gostersin.
    Oyunun baslangicinda kullanicinin puan degeri 0'dir. Kullanicidan secmek istedigi lokasyonun satir ve sutun sayisi girmesi istensin.
    Eger kullanicinin girdigi pozisyonda mayin yoksa oyuncunun puani 10 artirilir ve "Hala hayattasin....Devam" mesaji verilir
    ve yeni satir ve sutun degerleri girmesi istenir. eger kullanici mayinli bir bolge secmis ise "Oyun bitti! Puaniniz: "
    mesaji ile program sonlandirilir.
     */
    public static  int [][] haritaDoldur(int satir, int sutun){

        Random rnd = new Random();

        int [][] matris = new int [satir][sutun];
        int i =0;
        while(i<satir){
            int j=0;
            while (j<sutun){
                matris[i][j]=rnd.nextInt(2);
                j=j+1;
            }
            i=i+1;
        }
        for (int k = 0; k < satir; k++) {
            for (int l = 0; l < sutun; l++)
                System.out.print(matris[k][l] + " ");
            System.out.println();

        }
        return matris;
    }

    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        System.out.println("Oyunun satir boyutunu giriniz : ");
        int a= klavye.nextInt();
        System.out.println("Oyunun sutun boyutunu giriniz : ");
        int b= klavye.nextInt();
        int [][] oyunMatrisi = haritaDoldur(a,b);
        int puan =0;
        boolean kontrol= true;
        while(kontrol){
            System.out.println("Sectiginiz konumun satir degerini giriniz : ");
            int x=klavye.nextInt();
            System.out.println("Sectiginiz konumun sutun degerini girirniz : ");
            int y= klavye.nextInt();
            if (oyunMatrisi[x][y]==1){
                kontrol=false;
            }else{
                puan = puan + 10;
                System.out.println("Hala hayattasin....Devam");

            }
        }
        System.out.println("Oyun bitti! Puaniniz : " + puan);

    }
}


