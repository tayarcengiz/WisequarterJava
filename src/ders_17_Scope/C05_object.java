package ders_17_Scope;

import java.util.Scanner;

public class C05_object {
    public static void main(String[] args){
        //c03 clasindaki instens var lara nasil ulasabiliriz.
        //instens=obje vaiable, obje uzerinden ulasabiliriz
        Scanner scan=new Scanner(System.in);
        C03_objectvariable personel1=new C03_objectvariable();
        System.out.println(personel1.personelismi);
        System.out.println(personel1.personelyasi);//0
        personel1.personelismi="suleyman";
        personel1.personelyasi=45;

        C03_objectvariable personel2=new C03_objectvariable();
        personel2.personelismi="latife";
        personel2.personelyasi=37;

        System.out.println(personel1.personelismi);

        C03_objectvariable per3=new C03_objectvariable();
        per3.personelismi="Ali";
        per3.personelyasi=47;
        System.out.println(per3.personelyasi);

    }
}
