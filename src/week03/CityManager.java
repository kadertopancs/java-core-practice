package week03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CityManager {
    public static void main(String[] args) {

        /**4.Şehir Listesi Kontrolü
         Kullanıcıdan 6 tane şehir adı alınız.
         Girilen şehirleri saklayınız.
         Aynı şehir birden fazla girildiyse bunu tekilleştiriniz.
         Şehirleri ekrana yazdırınız.
         "Ankara" adlı bir şehir listede var mı kontrol ediniz.
         */
        Scanner input = new Scanner(System.in);

        Set<String> sehirler = new HashSet<>();

        // 6 şehir al
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ". şehir: ");
            String sehir = input.nextLine();
            sehirler.add(sehir);
        }

        // Tüm şehirleri yazdır
        System.out.println("\nBenzersiz şehirler:");
        System.out.println(sehirler);

        // Ankara kontrolü
        if (sehirler.contains("Ankara")) {
            System.out.println("Ankara listede var");
        } else {
            System.out.println("Ankara listede yok");
        }
    }
}
