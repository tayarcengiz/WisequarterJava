package ders_17_Scope;

public class C04_classvariable {
    public static void main(String[] args){
        // c03 deki hastane isminiyazdirmak istiyoruz. class var. old. icin isimiz kolay

        System.out.println(C03_objectvariable.hastaneismi);//yildiz hastanesi
        System.out.println(C03_objectvariable.hastasayisi);//23453
        C03_objectvariable.hastasayisi++;
        C03_objectvariable.hastasayisi++;
        method1();
        System.out.println(C03_objectvariable.hastasayisi);//23456



    } // main method yazdirma bitince resetlenir bastaki degerlere doner. kaydet demedik.
    public static void method1(){
        C03_objectvariable.hastasayisi++;


    }

}
