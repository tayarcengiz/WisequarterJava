package ders_10;

public class C09_Soru {
    public static void main(String[] arg) {
        // kul dan bir cumle ve bir metin al
        //cumle metni icermiyor
        //      cumle metni sadece bir kere iceriyor
        //     cumle metni birden fazla iceriyor yazdirin

        String cumle = "Java cok guzeldir cok";
        String metin = "cok";

        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)){
            System.out.println("cumle metni icermiyor");


        } else if (ilkIndex==sonIndex){
            System.out.println("cumle metni sadece birkere iceriyor");

        }else {
            System.out.println("cumle metni birdrn cok iceriyor");
        }

    }


}