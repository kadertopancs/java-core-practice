import java.util.Scanner;

public class CargoTracking {
    public static void main(String[] args) {
        /** Kargo Takip ve Teslim Seçimi:
         Kullanıcıdan 5 takip kodu alıp bir diziye kaydet.
         Her kod için baş/son boşlukları temizle ve kod uzunluğu 10 değilse uyarı ver.
         Kullanıcıdan teslim tipi al: "ev", "ofis", "şube".
         Teslim tipine göre ücret belirle.
         Kullanıcıdan mesafeyi (km) al; 30 km üstüyse ek ücret uygula.
         Son olarak, her kodun ilk 2 karakterini yazdır ve kodlarda kaç tane harf kaç tane
         rakam olduğunu toplamda say.
         */
        Scanner sc = new Scanner(System.in);

        String[] kodlar = new String[5];   // 5 takip kodu için dizi oluştur

        int toplamHarf = 0;
        int toplamRakam = 0;

        for (int i = 0; i < 5; i++) {   //Takip kodlarını al

            System.out.print((i + 1) + ". takip kodunu gir: ");
            kodlar[i] = sc.nextLine();

            kodlar[i] = kodlar[i].trim();

            if (kodlar[i].length() != 10) {  // uzunluk kontrolü
                System.out.println("Uyarı: Kod uzunluğu 10 olmalı!");
            }
        }


        System.out.print("Teslim tipi gir (ev/ofis/sube): "); //  Teslim tipi al
        String teslim = sc.nextLine();

        int ucret = 0;

        if (teslim.equalsIgnoreCase("ev")) {   // 4) Teslim tipine göre ücret
            ucret = 50;
        } else if (teslim.equalsIgnoreCase("ofis")) {
            ucret = 30;
        } else if (teslim.equalsIgnoreCase("sube")) {
            ucret = 20;
        } else {
            System.out.println("Geçersiz teslim tipi!");
        }

        System.out.print("Mesafeyi gir (km): ");    // Mesafe al
        int mesafe = sc.nextInt();


        if (mesafe > 30) { //30 km üstü ek ücret
            ucret += 10;
        }

        System.out.println("Toplam ücret: " + ucret);


        System.out.println("\nKodların ilk iki karakteri:");  //Kodların ilk 2 karakterini yazdır

        for (int i = 0; i < 5; i++) {

            if (kodlar[i].length() >= 2) {
                System.out.println(kodlar[i].substring(0, 2));
            }


            for (int j = 0; j < kodlar[i].length(); j++) {  // Harf ve rakam sayma

                char c = kodlar[i].charAt(j);

                if (c >= '0' && c <= '9') {
                    toplamRakam++;
                } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    toplamHarf++;
                }
            }
        }

        System.out.println("\nToplam harf sayısı: " + toplamHarf);
        System.out.println("Toplam rakam sayısı: " + toplamRakam);
    }
}
