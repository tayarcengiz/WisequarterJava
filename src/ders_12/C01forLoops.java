package ders_12;

public class C01forLoops {
    public static void main(String[] args) {

        String str = "Java\n";//alt satira yazar
        System.out.print(str.repeat(10)); // 10 kere yazar
        //repeat olmasaysı
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);




        for (int i = 1; i< 10; i++){


        System.out.print(i + " ");
        }

        // 7 ile bolunebilenleri yazdir
        for (int i=10; i<100; i++){
            if (i%7==0) System.out.print(i+" ");//14 21 28 35 42 49 56 63 70 77 84 91 98

            System.out.println("");


        }


        }


    }


