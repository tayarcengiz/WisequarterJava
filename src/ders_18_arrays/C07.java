package ders_18_arrays;

public class C07 {
    public static void main(String[] arg) {

        // verilen bir string Array deki en kisa ve en uzun kelimeleri yazdiran methot olustur,
        String[] arr ={"Hasan", "adem","Omer Faruk","Senturk"};
        enuzunenkisaisimleriyazdir(arr);


    }
    public static void enuzunenkisaisimleriyazdir(String[] arr){
        String enuzunkelime= arr[0];
        String enkisakelime= arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>enuzunkelime.length()){
                enuzunkelime=arr[i];


            }
            if (arr[i].length()<enkisakelime.length()){
                enkisakelime=arr[i];
            }

        }
        System.out.println("en uzun isim:"+ enuzunkelime);
        System.out.println("en kisa kelime:"+enkisakelime);


    }
}
