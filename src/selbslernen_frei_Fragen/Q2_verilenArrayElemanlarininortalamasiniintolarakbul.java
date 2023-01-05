package selbslernen_frei_Fragen;

public class Q2_verilenArrayElemanlarininortalamasiniintolarakbul {
    /*
    input[]={2,4,6,} output=4

    2. orlamadan buyuk olan sayilari yazdir.
     */
    public static void main(String[] args) {
        int[] array ={5,9,15,7};
        int ortalama=0;
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            toplam+=array[i];
            System.out.println("arrayin elemanlari toplami"+toplam);

        }


    }
}










/*
 System.out.println("arrayin uzunlugu="+array.length);
        ortalama = toplam / (array.length);
        System.out.println("verilen array elemanlari ortalamasi toplamaya gore:"+ortalama);
        for (int i = 0; i < array.length; i++) {
            if (array[i]>ortalama        ){
                System.out.println("ortalama ustundeki sayilar:"+array[i]);
            }
        }
 */