package ders_11;

public class C04_replaceAll {
    public static void main(String[] arg) {

        // kul nın girdigi metinde harf disinda kalan tum karakterleri temizleyen bir kod yaz
        //not space silinmemeli

        String input="Ja5+va cok 1*guzel";
        input=input.replaceAll("\\d","");// Ja+va cok *guzel   rakamlar gitti
        input=input.replace(" ","5");

        System.out.println(input);// bosluk yerine 5 yazar

        input=input.replaceAll("\\W",""); //Java5cok5guzel
        input=input.replace("5"," "); //Java cok guzel

        System.out.println(input);

        input=input.replaceAll("\\s+"," ");//bir ve fazla sayilar yerine 1 adet bosluk
        System.out.println(input);














        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        System.out.println(input); //javacokguzel   bosluklar gitti





    }

}
