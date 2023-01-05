package ders_21Arraylist;

import java.util.ArrayList;
import java.util.List;

public class C04_ArraydenTekrarlarisil {
    public static void main(String[] args) {
        //verilen arrayde tekrar eden sayilari tek bir kere olacak sekilde arrayi duzenleyin
       //
        int[] arr ={1,2,4,5,3,5,3,5,2,1,2,5,7,6};

        // bu soruyu arrayle yapmak cok zor//bunu yerine bu arrayi inceleyip tekrarsizlari once bir liste atayip
        //son array olusturup eski arraye atama yapariz

        //tekrarsiz bir liste yapalim
        List<Integer> tekrarsizliste =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizliste.contains(arr[i])){
                tekrarsizliste.add(arr[i]);
            }

        }
        System.out.println("tekrarsiz liste:"+tekrarsizliste);//tekrarsiz liste:[1, 2, 4, 5, 3, 7, 6]

        arr=new int[tekrarsizliste.size()];//[0 0 0 0 0] uzunlugu tamam

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizliste.get(i);
        }

       // array suan istenen hale geldi.en son listteki elementleri list e tasiyalim

     //   System.out.println("Arrayin tekrarsiz hali:"+ Arrays.toString(arr));



        //System.out.println(sayilar);

    }
}
