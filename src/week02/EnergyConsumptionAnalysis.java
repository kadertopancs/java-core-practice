package week02;

import java.util.Scanner;

public class EnergyConsumptionAnalysis {
    public static void main(String[] args) {

        /** Ev Enerji Tüketimi Analizi:
         Kullanıcıdan 12 aylık elektrik tüketimini (kWh) alıp bir diziye kaydet.
         Kullanıcıdan tarife seçimi al: "gündüz", "gece", "karma".
         Seçime göre birim fiyat belirle.
         Yıllık toplam maliyeti hesapla.
         Ayrıca, ortalamanın üstünde olan ayların kaç tane olduğunu say ve bu ayları "Ocak,
         Şubat..." şeklinde yazdır.
         */

        Scanner sc = new Scanner(System.in);

        String[] aylar = {"Ocak","Şubat","Mart","Nisan",
                "Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};

        double[] tuketim = new double[12];

        double toplam = 0;

        for(int i = 0; i < 12; i++) { // 12 ay tüketim al

            System.out.print(aylar[i] + " tüketim (kWh): ");
            tuketim[i] = sc.nextDouble();

            toplam += tuketim[i];
        }
        sc.nextLine();

        System.out.print("Tarife seç (gunduz / gece / karma): "); // tarife
        String tarife = sc.nextLine();

        double fiyat = 0;

        if(tarife.equals("gunduz")) {
            fiyat = 2;
        }
        else if(tarife.equals("gece")) {
            fiyat = 1.5;
        }
        else if(tarife.equals("karma")) {
            fiyat = 2.8;
        }

        double maliyet = toplam * fiyat;

        System.out.println("Yıllık toplam maliyet: " + maliyet);

        double ortalama = toplam / tuketim.length;

        System.out.println("Ortalamanın üstünde olan aylar:");

        int sayac = 0;

        for(int i = 0; i < 12; i++) {

            if(tuketim[i] > ortalama) {

                System.out.println(aylar[i]);
                sayac++;
            }
        }

        System.out.println("Toplam: " + sayac + " ay ortalamanın üstünde.");
    }
}
