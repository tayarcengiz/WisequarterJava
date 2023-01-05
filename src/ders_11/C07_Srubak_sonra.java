package ders_11;

public class C07_Srubak_sonra {
    public static void main(String[] arg) {
        //isim ve soy ismini ayri ayri al
        //isim uzunsa isim soy ismin ilk harfini buyuk gerisini kucuk yazdir
        //soyad uzunsa ismin ilk harfi buyuk digerleri kucuk,soismi buyuk harflerle yazdir

        String isim ="Mehmet";
        String soyad = "Harun";
        String yeniIsimSoyisim;

        if (isim.length()>soyad.length()){
            //1, sık yazdir
                    yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyad.substring(0,1).toLowerCase()+
                    soyad.substring(1).toLowerCase();



        }else {  //2,secenek
            yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyad.toUpperCase();





        }
        System.out.println(yeniIsimSoyisim);


    }
}
