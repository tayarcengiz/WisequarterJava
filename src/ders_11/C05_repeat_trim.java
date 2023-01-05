package ders_11;

public class C05_repeat_trim {
    public static void main(String[] arg) {

        String str = "java guzeldir ";
        System.out.println(str.repeat(4));// 4 kere aynı metni yazar

        str ="  Java guzeldir    ";
        System.out.println(str.length());//19

        str=str.trim();//bosluklari siler
        System.out.println(str);//Java guzeldir
        System.out.println(str.length());//13
        System.out.println();




    }
}
