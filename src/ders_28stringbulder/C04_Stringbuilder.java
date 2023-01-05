package ders_28stringbulder;

public class C04_Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);
        System.out.println(sb.capacity());
        System.out.println(sb.length());// 0 deger henuz atanmadi
        sb.append("java");//0
        System.out.println(sb);//java
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("guzeldir");

        System.out.println(sb);//java
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        //kapasite ne length i esitlemek istersek
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());


    }
}
