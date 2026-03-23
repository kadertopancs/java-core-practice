import java.util.Scanner;

public class CafeOrderTracking {
    public static void main(String[] args) {

        /** Kafe Sipariş Takibi:
         Kullanıcıdan 5 sipariş al: içecek adı ve boy (S/M/L). İçecek adlarını bir diziye, boyları
         ayrı bir diziye kaydet.
         İçecek türüne göre taban fiyat belirle (ör. kahve/çay/limonata/diğer).
         Boy seçimine göre fiyatı güncelle.
         Her sipariş için ödenecek tutarı ve gün sonunda toplam ciroyu yazdır.
         Ayrıca içecek adlarında "şekerli" kelimesi geçiyorsa bunu tespit edip kaç tane
         olduğunu say.
         */
        Scanner sc = new Scanner(System.in);

        // İçecek ve boy bilgilerini tutan diziler
        String[] icecek = new String[5];
        String[] boy = new String[5];

        double toplamCiro = 0;
        int sekerliSayisi = 0;

        for(int i = 0; i < 5; i++) {

            System.out.print("İçecek adı gir: ");
            icecek[i] = sc.nextLine();

            System.out.print("Boy gir (S/M/L): ");
            boy[i] = sc.nextLine();

            double fiyat = 0;

            // İçeceğe göre taban fiyat
            if(icecek[i].equalsIgnoreCase("kahve"))
                fiyat = 20;

            else if(icecek[i].equalsIgnoreCase("çay"))
                fiyat = 10;

            else if(icecek[i].equalsIgnoreCase("limonata"))
                fiyat = 15;

            else
                fiyat = 12;

            // Boya göre fiyat artır
            if(boy[i].equalsIgnoreCase("M"))
                fiyat = fiyat + 5;

            else if(boy[i].equalsIgnoreCase("L"))
                fiyat = fiyat + 10;

            // Şekerli içecek kontrolü
            if(icecek[i].contains("şekerli"))
                sekerliSayisi++;

            // Toplam ciro
            toplamCiro += fiyat;

            System.out.println("Sipariş fiyatı: " + fiyat);
        }

        // Gün sonu raporu
        System.out.println("Toplam ciro: " + toplamCiro);
        System.out.println("Şekerli içecek sayısı: " + sekerliSayisi);

    }
}
