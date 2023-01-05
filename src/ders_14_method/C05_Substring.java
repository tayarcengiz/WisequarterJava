package ders_14_method;

public class C05_Substring {
        public static void main(String[] args) {

        String input ="Java ne kadar guzel";
        int basIndexi=5;
        int bittiIndexi=7;
        kendiSubstringMethodumuz(input,basIndexi,bittiIndexi);
        kendiSubstringMethodumuz("Java",1,3);//
        kendiSubstringMethodumuz("deneme",6,3);
        kendiSubstringMethodumuz("Java",6,8);





    }
    public static void kendiSubstringMethodumuz(String input, int basIndexi,int bittiIndexi) {
        if (basIndexi > bittiIndexi) {
            System.out.println("bas indexi bitis indexinden buyuk olamaz");

        } else if (bittiIndexi >= input.length()) {
            System.out.println("bitis indexi sinirlar disinda");

        } else {
            for (int i=basIndexi;i<bittiIndexi; i++){
                System.out.print(input.charAt(i));

            }
            System.out.println("");

        }


        // bas ind dahil bitis indexi haric aradaki harfleri yazdir


    }

}
