package AyseHocaFragen;

import java.util.Scanner;

public class KoordinatDuzlemi {
  // Kullanicidan aldiginiz koordinat noktasinin (x=3,y=-1)
    // koordinat duzleminde hangi bölgede oldugunu yazdiran bir kod yaziniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Koordinat duzlemindeki yerini bulmak istediginiz noktanin x ve y degerlerini giriniz :");

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) System.out.println("Girdiginiz nokta 1. bolgededir.");
        else if (x < 0 && y > 0) System.out.println("Girdiginiz nokta 2. bolgededir.");
        else if (x < 0 && y < 0) System.out.println("Girdiginiz nokta 3. bolgededir.");
        else if (x > 0 && y < 0) System.out.println("Girdiginiz nokta 4. bolgededir.");
        else if (x != 0) System.out.println("Girdiginiz nokta X ekseni uzerindedir.");
        else if (y != 0) System.out.println("Girdiginiz nokta Y ekseni uzerindedir.");
        else System.out.println("Girdiginiz nokta Orijin'dir.");
    }
}
