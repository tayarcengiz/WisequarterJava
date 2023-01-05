package toshibaintellij.socrativeundAhmetPrktik;

public class AsalSayiMethodu {


    public static void main(String[] args) {
        int input=1;
        boolean asalmisonucu=asalSayiMi(59);
        System.out.println(asalmisonucu);
        System.out.println(asalSayiMi(52));
    }
    public static boolean asalSayiMi(int input){
          boolean asalSayiMi=true;
          for(int i=2;i<input; i++){
             if(input%i==0) {
                 asalSayiMi=false;
                 break;
             }


         }
        return asalSayiMi;
    }

}
