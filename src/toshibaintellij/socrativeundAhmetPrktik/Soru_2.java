package toshibaintellij.socrativeundAhmetPrktik;

public class Soru_2 {
    public static void main(String[] arg){

        String str1="Ali 12 ?_";
        System.out.println(str1.replaceAll("\\d","x"));//Ali xx ?_  sayi yerine x yazdik
        System.out.println(str1.replaceAll("\\D","x"));//xxxx12xxx  digital harici x yazdir
        //bosluga dahi x yazar
        System.out.println(str1.replaceAll("\\w","x"));//xxx xx ?x
        System.out.println(str1.replaceAll("\\W","x"));//Alix12xx_  bosluk ve karakterlere x yaz

        int a= 12; int b = 5;
        System.out.println(b>a); // false yazar
        System.out.println(a%2); // 0      2 ile bolumden kalan 0 yazar

        for (int i = 1; i< 10; i++){
            System.out.print(i + " ");}

        //13 den baslayip 100 ekadar 7ser 7 ser artirarak yazdir
        for (int i = 13; i <= 100; i += 7) {
            System.out.print(i + " ");//  13 20 27 34 41 48 55 62 69 76 83 90 97
        }








    }




}
