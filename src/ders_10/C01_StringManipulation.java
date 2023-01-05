package ders_10;

public class C01_StringManipulation {
    public static void main(String[] arg) {

        String str1= "Java";
        String str2="Guzeldir";
        boolean b1 =true;
        int sayi=20;
        double db1 =3.54;
        System.out.println(str1+str2+sayi); // Javatrue20
        // System.out.println(b1+ sayi); buna izin vermeyebilir
        System.out.println(sayi+db1); //23.54
        System.out.println(str1.concat("").concat(str2)); // str leri toplayarak birlestirir"Java Guzeldir"




        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8)); // 5 ve 8. harf arasi: gun



    }
}
