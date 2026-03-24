package week02;

import java.util.Scanner;

public class BusCardBalance {
    public static void main(String[] args) {
        /** Otobüs Kartı Bakiye Kontrolü:
         Kullanıcıdan 7 günlük yolculuk sayısını tek tek al ve bir diziye kaydet.
         Kullanıcıdan kart türünü al: "öğrenci", "tam", "indirimli".
         Kart türüne göre bir biniş ücretini belirle.
         Toplam harcama hesapla ve kullanıcıdan mevcut bakiyeyi al.
         Bakiye yeterliyse kalan bakiyeyi, değilse ne kadar eksik kaldığını yazdır.
         Ek olarak, gün isimlerini (Pzt-Sal-...) kullanarak en çok yolculuk yapılan günü
         ekrana yazdır.
         */

        Scanner sc = new Scanner(System.in);

        String[] gunler = {"Pzt","Sal","Çar","Per","Cum","Cts","Paz"};
        int[] yolculuk = new int[7];


        for(int i = 0; i < 7; i++) { // 7 gün yolculuk sayısını al
            System.out.print(gunler[i] + " günü kaç yolculuk: ");
            yolculuk[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.print("Kart türü gir (ogrenci / tam / indirimli): "); // kart türü al
        String kart = sc.nextLine();

        double ucret = 0;

        if(kart.equals("ogrenci")) {
            ucret = 20;
        }
        else if(kart.equals("tam")) {
            ucret = 40;
        }
        else if(kart.equals("indirimli")) {
            ucret = 32;
        }

        int toplamYolculuk = 0;

        for(int i = 0; i < 7; i++) {
            toplamYolculuk += yolculuk[i];
        }

        double toplamHarcama = toplamYolculuk * ucret;

        System.out.print("Mevcut bakiye gir: ");
        double bakiye = sc.nextDouble();

        if(bakiye >= toplamHarcama) {
            System.out.println("Kalan bakiye: " + (bakiye - toplamHarcama));
        }
        else {
            System.out.println("Eksik bakiye: " + (toplamHarcama - bakiye));
        }

        int max = yolculuk[0];// en çok yolculuk yapılan gün
        int maxGun = 0;

        for(int i = 1; i < 7; i++) {
            if(yolculuk[i] > max) {
                max = yolculuk[i];
                maxGun = i;
            }
        }

        System.out.println("En çok yolculuk yapılan gün: " + gunler[maxGun]);

    }
}
