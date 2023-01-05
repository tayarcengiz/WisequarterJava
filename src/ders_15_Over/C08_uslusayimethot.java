package ders_15_Over;

public class C08_uslusayimethot {
    public static void main(String[] args) {
        //bir syi ve ussunu iste ,whileloop kullanarak hesabı metotlayin
        int sayi=5;
        int us =3;
        ushesapla(sayi,us);
    }
    public static void ushesapla(int sayi,int us){
        int sonuc=1;

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);

    }
}
