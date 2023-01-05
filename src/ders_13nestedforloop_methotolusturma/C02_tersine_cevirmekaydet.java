package ders_13nestedforloop_methotolusturma;

public class C02_tersine_cevirmekaydet {
    public static void main(String[] arg) {

        //kullanıcıdan bir string isteyin stringi tersine cevirip kaydedin


        String input = "Java her gecen gun guzellesiyor";
        String tersinput="";
        for (int i = input.length()-1;i>=0; i--) {
            tersinput +=input.substring(i, i+1);

        }
        System.out.println("Ters hali :"+ tersinput);
        String input2="java";
        String tersinput2="";
        for (int j = input2.length()-1; j >=0 ; j--) {
            tersinput2+=input2.substring(j,j+1);

            System.out.println(tersinput2);// a   av    ava    avaj
                                           //substring(3,4), 2,3   (1,2)    (0,1)
                                           //          a      v      a         j

        }
        System.out.println(tersinput2);



    }


}
