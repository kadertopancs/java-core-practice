package week03;

import java.util.*;

public class GradeAnalyzer {
    public static void main(String[] args) {

        /**5.Sınav Notları Analizi
         Bir öğrencinin sınav notları giriliyor.
         Bazı notlar aynı olabilir.
         Tüm notları saklayınız.
         Farklı notları ayrı olarak gösteriniz.
         Her notun kaç kez girildiğini bulunuz.
         En çok tekrar eden notu ekrana yazdırınız.
         */
        Scanner input = new Scanner(System.in);

        List<Integer> notlar = new ArrayList<>();

        System.out.print("Kaç not gireceksin: ");
        int n = input.nextInt();

        // Notları al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". not: ");
            int not = input.nextInt();
            notlar.add(not);
        }

        // Map ile say
        Map<Integer, Integer> map = new HashMap<>();

        for (int not : notlar) {
            map.put(not, map.getOrDefault(not, 0) + 1);
        }

        // Farklı notlar
        Set<Integer> farkliNotlar = map.keySet();

        // Çıktılar
        System.out.println("\nFarklı notlar:");
        System.out.println(farkliNotlar);

        System.out.println("\nHer notun tekrar sayısı:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

