package week03;

import java.util.*;

public class StudentNameManager {
    public static void main(String[] args) {
        /* Sınıftaki İsimleri Düzenleme
        Bir sınıftaki öğrencilerin isimleri sırayla giriliyor.
        Aynı isim birden fazla kez yazılmış olabilir.
        Tüm isimleri saklayınız.
        Tekrar eden isimleri yalnızca bir kez gösteriniz.
        Kaç farklı öğrenci olduğunu ekrana yazdırınız.
        */

        Scanner input = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();

        System.out.print("Kaç öğrenci gireceksin: ");
        int n = input.nextInt();
        input.nextLine(); // buffer temizleme

        // Tüm isimleri al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". öğrenci ismi: ");
            String isim = input.nextLine();
            isimler.add(isim);
        }

        // Tekrarları kaldır
        Set<String> benzersiz = new HashSet<>(isimler);

        // Çıktılar
        System.out.println("\nTüm isimler:");
        System.out.println(isimler);

        System.out.println("\nTekrar edenler kaldırıldı:");
        System.out.println(benzersiz);

        System.out.println("\nFarklı öğrenci sayısı:");
        System.out.println(benzersiz.size());
    }
}
