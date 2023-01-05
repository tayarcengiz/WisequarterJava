package ders_12;

public class C07 {
    public static void main(String[] args) {
        //kullanıcıdan pozitif sayi al,1 den baslayarak tum sayilari yazdir,
        //3 ile bolunenin yerine fizz
        //5 ile bolunenin yerine Buzz
        // hem 3 hem 5 ile bolunenlerin yerine fizzbuzz  yazdirin.



        int sayi =130;
        for (int i=1; i<sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("fizzBuzz\n ");
            }else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");

            }else {
                System.out.print(i+" ");
            }




        }

    }
}
