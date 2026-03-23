import java.util.Scanner;

public class MarketShoppingList {
    public static void main(String[] args) {


        /** Market Alışveriş Listesi:
         Kullanıcıdan kaç ürün gireceğini al. Her ürün için ürün adını iste ve bir listeye ekle.
         Sonra kullanıcıdan bir kategori seçmesini iste: "meyve", "sebze", "atıştırmalık",
         "içecek".
         Seçime göre, listede geçen ürün adlarında bazı düzenlemeler yap:
         - Ürün adının başındaki/sonundaki boşlukları temizle.
         - Ürün adını ekrana daha düzenli biçimde yazdır (ör. ilk harfi büyük).
         Son olarak, listedeki ürünlerin kaç tanesinde rakam geçtiğini sayıp ekrana yazdır.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç ürün gireceksiniz: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] urunler = new String[n];


        for(int i = 0; i < n; i++) {
            System.out.print("Ürün adı gir: ");
            urunler[i] = sc.nextLine();
        }

        System.out.print("Kategori seç (meyve / sebze / atıştırmalık / içecek): ");
        String kategori = sc.nextLine();

        int rakamliUrunSayisi = 0;

        System.out.println("\nDüzenlenmiş ürün listesi:");

        for(int i = 0; i < n; i++) {

            // boşlukları temizle
            urunler[i] = urunler[i].trim();

            // ilk harfi büyük yap
            String duzenli = urunler[i].substring(0,1).toUpperCase() + urunler[i].substring(1).toLowerCase();

            System.out.println(duzenli);


            for(int j = 0; j < urunler[i].length(); j++) {  // ürün içinde rakam var mı kontrol et

                if(urunler[i].charAt(j) >= '0' && urunler[i].charAt(j) <= '9') {
                    rakamliUrunSayisi++;
                    break;
                }
            }
        }

        System.out.println("Rakam içeren ürün sayısı: " + rakamliUrunSayisi);




    }
}
