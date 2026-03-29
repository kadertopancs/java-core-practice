package week03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        /*3.Kelime Tekrar Sayısı
         Kullanıcıdan bir cümle alınız.
         Cümledeki kelimeleri ayırınız ve her kelimenin kaç kez geçtiğini bulunuz.
         Sonucu örnek olarak şu şekilde yazdırınız: elma = 2, armut = 1
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir cümle gir: ");
        String cumle = input.nextLine();

        String[] kelimeler = cumle.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String kelime : kelimeler) {
            map.put(kelime, map.getOrDefault(kelime, 0) + 1);
        }

        System.out.println("\nKelime tekrar sayıları:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
    }
}

