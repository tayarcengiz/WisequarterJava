package ders_10;

public class C07_soru {
    public static void main(String[] arg) {
        String cumle = "Java cok guzeldir cok";
        String metin = "cok";

        if (!cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");
        } else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(metin, ilkIndex + 1); // ya -1 yada index
            if (ikinciIndex == (-1))
            {
                System.out.println("cumle metni birkere iceriyor");


            }else{
                System.out.println("cumle metni birden fazla iceriyor");


            }
            // kul dan bir cumle ve bir metin al
            //cumle metni icermiyor
            //      cumle metni sadece bir kere iceriyor
        }//     cumle metni birden fazla iceriyor yazdirin



    }










}