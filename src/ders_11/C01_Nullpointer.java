package ders_11;

public class C01_Nullpointer {

    public static void main(String[] arg) {
        String str1= ";";
      // str e deger atanmistir.
        System.out.println(str1); //hiclik  (;) yazdirir
        System.out.println(str1.concat("Java"));//Java

        String str2;
        //System.out.println(str2);
        //System.out.println(str2.concat(str"Java"));
        // deger atanmadigi icin altıni cizer str2 niniSystem.out.println();
        str2="java candir";
        System.out.println(str2);
        System.out.println(str2.concat("."));//java candir. . ilave eder
        String str3=null; // str3 e deger atanmadigini bildigimizijavaya soyluyoruz
        System.out.println(str3);//null isaretlendigini yazdirir
        System.out.println(str3+"java");//nulljava
        System.out.println(str3.toUpperCase());// nullPOintexception hatasi yazdirir





        System.out.println(str3.concat("java")); //nullpointerException hatasi verir str=null old icin













    }

}