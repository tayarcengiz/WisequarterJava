package ders_10;

public class C10_stringManipulation {
    public static void main(String[] arg) {

        String str ="";
        System.out.println(str.isEmpty());
        str="    ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());// ici bosluklar icerir mi

        str="x";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());




    }
}