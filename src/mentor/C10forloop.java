package mentor;

public class C10forloop {
    public static void main(String[] arg) {
        //verilen sayidan baslayarak geriye dogru bire kadar 3 ile bolunebilen sayilari yazdirin.
        int input =100;
        for (int i = 100; i >=1 ; i--) {
            if( i%3==0){
                System.out.print(i+"  ");
            }
        }
        System.out.println(" ");
        // verilen iki sayinin ilkinden baslayarak 3 er atrirarak yazdirin.
        int bas=20;
        int bit=100;
        for (int i = bas; i <=bit ; i+=3) {
            System.out.print(i+" ");

        }

    }
}
