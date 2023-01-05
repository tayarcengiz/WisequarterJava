package ders_07;

public class C06_NestedElse {

    public static void main(String[] args) {
            // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
            // kullaniciya musteri karti olup olmadigini sorun.
            // Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise  %15 indirim yapin,
            // Musteri karti yoksa 10 urunden fazla alirsa %15, 10 urunden az ise  %10 indirim yapin

        int urunAdedi=30;

        boolean kartVarmi = false;
        double listeFiyati=12.5;
        double toplamFiyat= 0;
        // ana degisken kart olsun
        if (kartVarmi) {
            // kart var
            if (urunAdedi < 0) {
                System.out.println("Hatali urun adedi girdiniz");

            } else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 indirimli tolam fiyat:" + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.80;
                System.out.println("%20 ind fiyat" + toplamFiyat);
            }


        } else {
              //kart yok
            if (urunAdedi < 0) {
                System.out.println("Hatali urun adedi girdiniz");

            } else if (urunAdedi < 10) {
                toplamFiyat = urunAdedi * listeFiyati * 0.90;
                System.out.println("%10 indirimli tolam fiyat:" + toplamFiyat);
            } else {
                toplamFiyat = urunAdedi * listeFiyati * 0.85;
                System.out.println("%15 ind fiyat" + toplamFiyat);
            }
            toplamFiyat = urunAdedi * listeFiyati * 0.80;
            System.out.println("%20 indirimli fiyat" + toplamFiyat);

            }
        }




    }







