import java.util.Scanner;

public class CinemaTicketing {
    public static void main(String[] args) {

        /** Sinema Biletleme:
         Kullanıcıdan kaç bilet alacağını al ve her bilet için film adını bir diziye kaydet.
         Kullanıcıdan salon türünü al: "2d", "3d", "imax".
         Salon türüne göre bilet fiyatı belirle.
         Kullanıcıdan yaş grubunu al: "çocuk", "öğrenci", "yetişkin", "65+" ve indirimi uygula.
         Her film için kaç bilet alındığını sayıp raporla.
         Film adlarında aynı filmin farklı yazımları varsa (ör. büyük/küçük harf farkı),
         sayımda aynı kabul et.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç bilet alacaksınız: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] filmler = new String[n];

        // Film isimlerini al
        for(int i = 0; i < n; i++) {
            System.out.print("Film adı gir: ");
            filmler[i] = sc.nextLine();
        }

        System.out.print("Salon türü gir (2d / 3d / imax): "); // salon türü
        String salon = sc.nextLine();

        double fiyat = 0;

        if(salon.equals("2d")) {
            fiyat = 120;
        }
        else if(salon.equals("3d")) {
            fiyat = 180;
        }
        else if(salon.equals("imax")) {
            fiyat = 201;
        }

        System.out.print("Yaş grubu gir (cocuk / ogrenci / yetiskin / 65+): ");  // yaş grubu
        String yas = sc.nextLine();

        double indirim = 0;

        if(yas.equals("cocuk") || yas.equals("ogrenci")) {
            indirim = 0.50;
        }
        else if(yas.equals("65+")) {
            indirim = 0.40;
        }

        double sonFiyat = fiyat - (fiyat * indirim);

        double toplam = sonFiyat * n;

        System.out.println("Bilet fiyatı: " + sonFiyat);
        System.out.println("Toplam ödeme: " + toplam);


        for(int i = 0; i < n; i++) {

            int sayac = 0;

            for(int j = 0; j < n; j++) {

                if(filmler[i].equalsIgnoreCase(filmler[j])) { // aynı film sayımı
                    sayac++;
                }

            }

            System.out.println(filmler[i] + " filminden " + sayac + " adet var");
        }
    }
}
