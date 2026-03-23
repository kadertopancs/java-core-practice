import java.util.Scanner;

public class CarMaintenanceReminder {
    public static void main(String[] args) {
        /** Araç Bakım Hatırlatıcısı:
         Kullanıcıdan 8 farklı bakım kaleminin adını al (ör. yağ değişimi, lastik, fren, filtre...)
         ve bir diziye kaydet.
         Her kalem için, son bakım tarihini "GG/AA/YYYY" biçiminde metin olarak al ve ayrı
         bir diziye kaydet.
         Kullanıcıdan bakım türünü seçmesini iste: "acil", "normal", "kontrol".
         Seçime göre uyarı mesajı üret.
         Girilen tarih metninde "/" karakteri yoksa veya uzunluk uygunsuzsa uyarı ver.
         Son olarak, bakım adı içinde en az 1 rakam geçen kayıt var mı kontrol et ve toplam
         kaç tanesinde rakam geçtiğini yazdır.
         */

        Scanner sc = new Scanner(System.in);

        String[] bakim = new String[8];
        String[] tarih = new String[8];

        int rakamSayisi = 0;

        for(int i = 0; i < 8; i++){    // 1) 8 bakım kalemi al

            System.out.print((i+1) + " . Bakım adı gir: ");
            bakim[i] = sc.nextLine();

            System.out.print("Son bakım tarihi (GG/AA/YYYY): ");     // 2) tarih al
            tarih[i] = sc.nextLine();


            if(!tarih[i].contains("/") || tarih[i].length() != 10){  // 3) tarih kontrolü
                System.out.println("Tarih formatı yanlış!");
            }

            for(int j = 0; j < bakim[i].length(); j++){   // 6) bakım adında rakam var mı kontrol
                if(bakim[i].charAt(j) >= '0' && bakim[i].charAt(j) <= '9'){
                    rakamSayisi++;
                    break;
                }
            }
        }

        System.out.print("Bakım türü seç (acil / normal / kontrol): "); // 4) bakım türü al
        String tur = sc.nextLine();

        if(tur.equals("acil")){   // 5) mesaja göre yazdır
            System.out.println("Araç çok acil bir şekilde servise gitmeli!");
        }
        else if(tur.equals("normal")){
            System.out.println("Araç çok geçmeden şekilde servise gitmeli!");
        }
        else if(tur.equals("kontrol")){
            System.out.println("Araç kontrol edilmeli!");
        }

        System.out.println("Rakam içeren bakım adı sayısı: " + rakamSayisi);
    }
}

