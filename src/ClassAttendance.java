import java.util.Scanner;

public class ClassAttendance {
    public static void main(String[] args) {
        /** Sınıf Yoklama ve İsim Düzeltme:
         Kullanıcıdan sınıftaki öğrenci sayısını al ve öğrencilerin isimlerini sırayla alıp bir
         diziye kaydet.
         Her isim için:
         - Baş/son boşlukları temizle
         - İsim içinde boşluk yoksa (tek kelimeyse) uyarı ver
         Kullanıcıdan bir yoklama kodu al: "G" (geldi), "Y" (yok), "R" (raporlu).
         Koda göre bir mesaj yazdır.
         Sonra tüm isimleri numaralı şekilde ekrana bas ve içinde 'a' harfi geçen isimleri say.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Sınıfta kaç öğrenci var: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] isimler = new String[n];

        int aSayisi = 0;


        for(int i = 0; i < n; i++) {

            System.out.print("Öğrenci adı gir: "); // isimleri al
            isimler[i] = sc.nextLine().trim().toUpperCase();

            // isimde boşluk var mı
            if(!isimler[i].contains(" ")) {
                System.out.println("Uyarı: isim tek kelime!");
            }

            if(isimler[i].toLowerCase().contains("a")) {     // 'a' harfi kontrol
                aSayisi++;
            }
        }


        System.out.print("Yoklama kodu gir (G/Y/R): "); // yoklama kodu
        String kod = sc.nextLine();

        if(kod.equalsIgnoreCase("G")) {
            System.out.println("Öğrenci geldi.");
        }
        else if(kod.equalsIgnoreCase("Y")) {
            System.out.println("Öğrenci yok.");
        }
        else if(kod.equalsIgnoreCase("R")) {
            System.out.println("Öğrenci raporlu.");
        }

        System.out.println("\nÖğrenci listesi:");


        for(int i = 0; i < n; i++) {
            System.out.println((i+1) + ". " + isimler[i]); // numaralı yazdır
        }

        System.out.println("İçinde 'a' harfi olan isim sayısı: " + aSayisi);

    }
}
