package ders_23Oopiconsept;

public class DArabarunner {

        public static void main(String[] args) {
            // DAraba class'indan bir obje olusturalim
            DAraba arb1= new DAraba();
            System.out.println(arb1); // Marka belirtilmedi
            System.out.println(arb1.marka); // Marka belirtilmedi
            System.out.println(arb1.model); // Model belirtilmedi
            System.out.println(arb1.yakit); // null
            System.out.println(arb1.yil); // 0
            System.out.println(arb1.fiyat); // 0
            arb1.marka="Tofas";
            arb1.model="Kartal";
            arb1.yakit="Benzin";
            arb1.yil=1991;
            arb1.fiyat=50000;
            System.out.println(arb1.marka); // Tofas
            System.out.println(arb1.model); // Kartal
            System.out.println(arb1.yakit); // Benzin
            System.out.println(arb1.yil); // 1991
            System.out.println(arb1.fiyat); // 50000
            System.out.println(arb1.maxHiz(arb1.yakit));
            DAraba arb2=new DAraba();
            // arb2'nin ozelliklerini yazdirmak istesek
            System.out.println("Marka : " + arb2.marka +
                    "\nModel : " + arb2.model+
                    "\nYakit : " + arb2.yakit+
                    "\nYil : " + arb2.yil+
                    "\nFiyat : " + arb2.fiyat);
            /*
            Marka : Marka belirtilmedi
            Model : Model belirtilmedi
            Yakit : null
            Yil : 0
            Fiyat : 0
             */
            DAraba arb3=new DAraba();
            System.out.println(arb3);
            /*
            Araba Ozellikleri
            marka : Marka belirtilmedi
            model : Model belirtilmedi
            yakit : null
            yil : 0
            fiyat : 0
             */
            System.out.println(arb1);
            /*
             Araba Ozellikleri
             marka : Tofas
             model : Kartal
             yakit : Benzin
             yil : 1991
             fiyat : 50000
             */
            DAraba arb4= new DAraba();
            System.out.println(arb4);

        }

}




