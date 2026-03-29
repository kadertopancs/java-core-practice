package week03;

import java.util.*;

public class ShoppingListManager {
    public static void main(String[] args) {

        /* 2.Market Alışveriş Listesi
        Bir kullanıcı marketten alacağı ürünleri giriyor.
        Bazı ürünler tekrar girilmiş olabilir.
        Girilen tüm ürünleri saklayınız.
        Tekrar eden ürünleri ayıklayınız.
        Son durumda listedeki ürünleri ekrana yazdırınız.
         */

        Scanner input = new Scanner(System.in);
        List<String> urunler = new ArrayList<>();

        System.out.print("Kaç ürün gireceksin: ");
        int n = input.nextInt();
        input.nextLine(); // buffer temizle

        // Ürünleri al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ürün: ");
            String urun = input.nextLine();
            urunler.add(urun);
        }

        // Tekrarları kaldır
        Set<String> benzersiz = new LinkedHashSet<>(urunler);

        // Çıktılar
        System.out.println("\nGirilen tüm ürünler:");
        System.out.println(urunler);

        System.out.println("\nTekrar edenler kaldırıldı:");
        System.out.println(benzersiz);
    }
}

