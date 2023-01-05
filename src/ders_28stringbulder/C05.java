package ders_28stringbulder;

public class C05 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java candir");
        System.out.println(sb.reverse());//ridnac avaJ       ters cevirir
        sb.reverse();// tekrar ters cevirir
        sb.replace(1,2,"yaaaa");
        System.out.println(sb);//Jyaaaava candir

        sb.insert(11,"Bu bir yalandir");
        System.out.println(sb);//Jyaaaava caBu bir yalandirndir

        String str="java cok guzeldir";
        sb.insert(21,str,9,14);



    }
}
