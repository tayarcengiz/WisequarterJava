package ders_11;

public class C06_Soru {
    public static void main(String[] arg) {
        // kul dan cumle al cumlede ev gecşyorsa"home home sweet home" yazdir
        //cumledeis geciyorsa "calismak guzeldir yazdir"
        //ikiside geciyorsa "hem ev hem is
        //hicbiri gecmiyorsa cok calisman lazim yazdir

        String cumle= "Eve geldim,isler birikmis";
        String cumleCopy=cumle.toLowerCase();

        if (cumleCopy.contains("ev") &&cumleCopy.contains("is") ){
            System.out.println("Hem ev lazim hem is");

        } else if (cumleCopy.contains("ev")) {
            System.out.println("home home sweet home");



        } else if (cumleCopy.contains("is")) {
            System.out.println("calismak guzeldir");


        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
