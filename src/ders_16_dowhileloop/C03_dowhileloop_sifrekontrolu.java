package ders_16_dowhileloop;

public class C03_dowhileloop_sifrekontrolu {
    public static void main(String[] args) {
        // kul dan pozitif tamsayi iste sayi kare ise true yanlissa false yazdirin

        int input=128;
        int baslangic=1;
        int bayrak=0;
        do{
            if(baslangic*baslangic==input){
                System.out.println("true");
                bayrak++;
                break;
            }
            baslangic++;
        }while (baslangic*baslangic<=input);
        if(bayrak==0){
            System.out.println("false");
        }






    }
}
