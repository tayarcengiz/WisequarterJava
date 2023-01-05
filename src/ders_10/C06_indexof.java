package ders_10;

public class C06_indexof {

    public static void main(String[] arg) {

        String str = "Ahmet hoca ile hersey clear";
        System.out.println(str.indexOf("a")); // 9 ilk a nin indexini dondurur.
        System.out.println(str.indexOf("c")); //8
        System.out.println(str.indexOf("hersey")); //15
        System.out.println(str.indexOf("e", 9)); // 13
        // 13. index e den bir sonraki e nin indexini bulalim
        System.out.println(str.indexOf("e", 14)); // 13
        // cumledeki 2. c nin indexini yazdirin

        int ilkcindex= str.indexOf("c"); //8
        System.out.println(str.indexOf( "c", ilkcindex+1)); //22

        System.out.println(str.indexOf("ali"));  // index olarak int dondurmeli




    }
}
