package ders_22Array;

public class C04_foreachloop {
   public static void main(String[] args) {


     int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 4, 5};
     int toplam = 0;
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] > 5) {
             toplam += arr[i];
         }

     }        System.out.println("for loop ile topla:" + toplam);
             //hangi data turunde degisgenlerle ugrasacagiz,2 loopicinde
             // her bir eleman gelince hangi isimle islem yapacagiz
             //3 hangi array veya colektiondan gelecek
             toplam = 0;

         for (int each : arr) {
             {
                 if (each > 5) {
                     toplam += each;
                 }



             }

         }
         System.out.println("for each loop ile topla:"+toplam);
   }
}


