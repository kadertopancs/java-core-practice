package week02;

import java.util.Scanner;

public class OperatorPackageSelection {
    public static void main(String[] args) {
        /** Telefon Operatörü Paket Seçimi:
         Kullanıcıdan 6 aylık internet kullanımlarını (GB) alıp bir diziye kaydet.
         Kullanıcıdan paket tipini al: "mini", "standart", "premium".
         Paket tipine göre aylık kota belirle.
         Her ay için kota aşıldı mı kontrol et; aşıldıysa aşım miktarını yazdır.
         Sayfa 2 Mersys Dersleri - Ödev Soruları
         En çok aşım olan ayı bul.
         Ayrıca kullanıcıdan müşteri numarasını al; numaranın uzunluğu belirli değilse hata
         mesajı ver ve numara içinde kaç tane rakam olduğunu say.
         */
        Scanner scanner = new Scanner(System.in);


        double[] kullanim = new double[6]; //6 aylık internet kullanımı al

        System.out.println("6 aylık internet kullanımını (GB) giriniz:");

        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ". ay: ");
            kullanim[i] = scanner.nextDouble();
        }

        scanner.nextLine(); // buffer temizleme

        System.out.print("Paket tipini giriniz (mini / standart / premium): ");
        String paket = scanner.nextLine().toLowerCase();  //Paket tipi al

        double kota = 0;

        if (paket.equals("mini")) {
            kota = 20;
        } else if (paket.equals("standart")) {
            kota = 50;
        } else if (paket.equals("premium")) {
            kota = 100;
        } else {
            System.out.println("Geçersiz paket tipi!");
            return;
        }

        double enCokAsim = 0;
        int enCokAsimAy = 0;

        for (int i = 0; i < 6; i++) {

            if (kullanim[i] > kota) {   //Aşım kontrolü

                double asim = kullanim[i] - kota;

                System.out.println((i + 1) + ". ay kota aşıldı. Aşım: " + asim + " GB");

                if (asim > enCokAsim) {
                    enCokAsim = asim;
                    enCokAsimAy = i + 1;
                }

            }
            else {
                System.out.println((i + 1) + ". ay kota aşılmadı.");
            }
        }

        if (enCokAsim > 0) {
            System.out.println("En çok aşım olan ay: " + enCokAsimAy +
                    " (Aşım: " + enCokAsim + " GB)");
        } else {
            System.out.println("Hiç aşım yapılmadı.");
        }


        System.out.print("\nMüşteri numarasını giriniz (11 haneli): "); //Müşteri numarası kontrolü (11 haneli)
        String musteriNo = scanner.nextLine();

        if (musteriNo.length() != 11) {
            System.out.println("HATA: Müşteri numarası 11 haneli olmalıdır.");
        } else {

            int rakamSayisi = 0;

            for (int i = 0; i < musteriNo.length(); i++) {

                if (Character.isDigit(musteriNo.charAt(i))) {
                    rakamSayisi++;
                }
            }

            System.out.println("Numara içinde " + rakamSayisi + " adet rakam vardır.");

            if (rakamSayisi == 11) {
                System.out.println("Müşteri numarası geçerli.");
            } else {
                System.out.println("Müşteri numarası geçersiz! Sadece rakamlardan oluşmalıdır.");
            }
        }

        scanner.close();
    }
}
