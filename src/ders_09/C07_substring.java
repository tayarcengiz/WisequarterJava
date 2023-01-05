package ders_09;

public class C07_substring {

    public static void main(String[] arg) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8)); // 5 ve 8. harf arasi: gun

        System.out.println(str.substring(9,17)); // gectikce

        String isim = "HASAN";
        //VERİLEN İSMİN İLK HARFİNİ BUYUK GERİYE KALANLARİ KUCUK HARF OLARAK KAYDET

        isim = isim.substring(0,1).toUpperCase()+ // ilk harfi aldik buyuk harf yaptik
               isim.substring(1).toLowerCase();
        System.out.println(isim);  // Hasan  isim artk kalici olarak boyle atandi
        System.out.println(isim.substring(2,5)); //san
        // sadece 3. harfi yazdirin
        System.out.println(isim.substring(3,4)); //e
        System.out.println("zor sorunun cevabi:"+isim.substring(2,2)); //hiclik

        System.out.println(isim.substring(5,2)); // geriye gitmez hatasi yazdirir













    }
}
