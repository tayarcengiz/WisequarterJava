package ders_061;

public class ogrenci_sorucevap {

}


    /*
    20 kasim 2022 pazar gunu
Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
isaretiyle yazdırmak !ç!n gereken kodu yazınız.
Örnegin; 75.4238 ´ *4*2*3*8 (edited)
Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır. (edited)
Soru - 3 -		ayna check sorusu:		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };		 output : verilen array simetriktir (edited)
 Soru -4 :    * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
Soru 5 :  verilen isim ve soyismi ilk harfi buyuk        // geriye kalanlari * olacak sekilde degistirip        // bize bu halini donduren bir method olusturun        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz
 Soru 6 : verilen cumlede kelimeyi sayan bir method olusturun
 Soru 7 : String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
 Soru 8 : Task kullanicidan dogum tarihini isteyin ve gelen tarihi LocalDate clasindan bir degiskene atayin. Daha sonra kullanicidan random tarih girmesini isteyin. Random tarih dogum tarihinizden sonra ise program kabul etmesin ve kullanici yeniden tarih girsin. Sonuc olarak girilen random tarih dogum gununuzden once olmali.
 Soru -9 : String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
Soru 10 : İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
Soru -1- Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
isaretiyle yazdırmak !ç!n gereken kodu yazınız.
Örnegin; 75.4238 ´ *4*2*3*8
1. Yol:
double num = 75.4238;
String s = String.valueOf(num);
int idxOfComma = s.indexOf(".");
String decimalPart = s.substring(idxOfComma + 1);
String t = "";
for(Integer i=0; i<decimalPart.length(); i++){
String r = decimalPart.substring(i,i+1);
t = t + "*" + r;
}
System.out.println(t);
2. Yol:
double num = 75.4238;
String s = String.valueOf(num);
int idxOfComma = s.indexOf(".");
String decimalPart = s.substring(idxOfComma + 1);
String t = "";
Integer i=0;
while(i<decimalPart.length()){
String r = decimalPart.substring(i,i+1);
t = t + '*' + r;
i++;
}
System.out.println(t);
3. Yol:
double num = 75.4238;
String s = String.valueOf(num);
int idxOfComma = s.indexOf(".");
String decimalPart = s.substring(idxOfComma + 1);
String t = "";
Integer i=0;
do{
String r = decimalPart.substring(i,i+1);
t = t + '*' + r;
i++;
}while(i<decimalPart.length());
System.out.println(t);
===============================================================================================
Soru - 2 - Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
int num = 10;
for(int i=0; i<arr.length; i++) {
for(int j=i+1; j<arr.length; j++) {
if(arr[i]+arr[j]==num) {
System.out.println(arr[i] + " + " + arr[j] + " = " + num);
}
}
}
=========================================================================================================
Soru-3 -
ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
    /*
    int arr[] = { 1, 2, 3, 4, 5,8,4, 3, 2, 1 };
    int count=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(arr.length%2==0){
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            }
        }
    }else System.out.println("Çit elemanlı olmayan  array simetrik olamaz ");
        if(count==arr.length/2){
        System.out.println("Verilen Array simetriktir ");
    }else System.out.println("Verilen array simetrik değildir");
}
}
        ==========================================================================================================
        soru 7 -     String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength = b[0].length();
        for(String w : b){
        minLength = Math.min(minLength, w.length());
        }
        for(String w : b){
        if(minLength == w.length()){
        System.out.println(w);
        }
        }
        ========================================================================================================================
        Soru -9 :   String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        alınız.
        Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String initials = "";
        for(String w : b){
        if(w.endsWith("n") || w.endsWith("k")){
        initials = initials + w.substring(0,1);
        }
        }
        System.out.println(initials);
        ================================================================================================================
        Soru 10 :
        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int size = arr.length;
        for(Integer i=0; i<size; i++){
        String firstChar = arr[i].substring(0, 1);
        String lastChar = arr[i].substring(arr[i].length()-1);
        if(firstChar.equals(lastChar)){
        System.out.println(arr[i]);
        }
        }

     */

