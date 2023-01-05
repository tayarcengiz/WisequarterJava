package toshibaintellij.PROJECK;

import java.util.Scanner;

public class bankasifreProje {


        /*
        ATM
    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
    geri donsun.
    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
         */
        final static String kartNo = "1234567890123456";
        static Scanner scan = new Scanner(System.in);
        static String sifre = "1234";
        static double bakiye = 20000;

        public static void main(String[] args) {
            giris();
        }

        private static void giris() {
            System.out.print("KART NUMARASI GIRINIZ:");

            String kKartno = scan.nextLine();

            System.out.print("SIFRE GIRINIZ: ");

            String kSifre = scan.next();
            kKartno = kKartno.replaceAll("\\s", "");
            if (kSifre.equals(sifre) && kKartno.equals(kartNo)) {
                menu();
            } else {
                System.out.println("YANLIS GIRIS YAPILDI");
                giris();
            }
        }

        private static void menu() {
            System.out.println("******JAVABANKA HOSGELDİNİZ*****\n" +
                    "YAPMAK ISTEDIGINIZ ISLEMİ SECINIZ\n" +
                    "1. BAKIYE SORGULAMA\n" +
                    "2. PARA YATIRMA\n" +
                    "3. PARA CEKME\n" +
                    "4. PARA GONDERME\n" +
                    "5. SIFRE DEGISTIRME\n" +
                    "6. CIKIS");
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    bakiyeSorgula();
                }
                case 2: {
                    System.out.print("YATIRILACAK MIKTARI GIRINIZ:");
                    double miktar = scan.nextDouble();
                    paraYatirma(miktar);
                }
                case 3: {
                    System.out.println("CEKILECEK MIKTARI GIRINIZ:");
                    double miktar = scan.nextDouble();
                    paraCekme(miktar);
                }
                case 4: {
                    System.out.println("IBAN GIRINIZ: ");
                    String iban = scan.nextLine();
                    scan.nextLine();
                    System.out.println("GONDERILECEK MIKTARI GIRINIZ:");
                    double miktar = scan.nextDouble();

                    paraGonderme(ibanKontrol(iban), miktar);
                }
                case 5: {
                    sifreDegistir();
                }
                case 6: {
                    System.out.println("******HOSCAKALIN******");
                    System.exit(0);
                }


            }
        }

        private static void sifreDegistir() {
            System.out.println("ESKI SIFRENIZI GIRINIZ: ");
            String kSifre = scan.next();
            if (kSifre.equals(sifre)) {
                System.out.println("YENI SIFRE GIRINIZ:");
                sifre = scan.next();
                giris();
            } else {
                System.out.println("DOGRU SIFRE GIRINIZ: ");
                sifreDegistir();
            }
        }

        private static void paraGonderme(String iban, double miktar) {
            if (miktar <= bakiye) {
                bakiye -= miktar;
                System.out.println(iban + " NOLU IBANA " + miktar + " GONDERILDI");
                bakiyeSorgula();
            } else {
                System.out.println("GECERLI MIKTAR GIRINIZ:");
                paraGonderme(iban, scan.nextDouble());
            }
        }

        private static String ibanKontrol(String iban) {
            iban = iban.replaceAll("\\s", "");
            if (iban.startsWith("TR") && iban.length() == 26) {

            } else {
                System.out.println("GECERLI IBAN GIRINIZ: ");
                //String iban2 = scan.nextLine();
                //ibanKontrol(iban2);
                scan.nextLine();
                ibanKontrol(scan.nextLine());
            }
            return iban;
        }

        private static void paraCekme(double miktar) {
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();

            } else {
                System.out.println("GECERLI MIKTAR GIRINIZ");
                paraCekme(scan.nextDouble());
            }
        }

        private static void paraYatirma(double miktar) {
            bakiye += miktar;
            bakiyeSorgula();

        }

        private static void bakiyeSorgula() {
            System.out.println("BAKIYENIZ: " + bakiye);
            menu();
        }


}
