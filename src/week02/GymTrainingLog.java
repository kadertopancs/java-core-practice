package week02;

import java.util.Scanner;

public class GymTrainingLog {
    public static void main(String[] args) {
        /** Spor Salonunda Antrenman Günlüğü:
         Kullanıcıdan 7 gün için antrenman türünü al: "koşu", "ağırlık", "yüzme", "dinlenme"
         ve bir diziye kaydet.
         Her gün için dakika bilgisini alıp ayrı bir diziye kaydet.
         Antrenman türüne göre yakılan kalori katsayısı belirle ve günlük kalorileri hesapla.
         Toplam kalori, en yüksek kalori olan gün ve kaç gün "dinlenme" seçildiğini yazdır.
         Ayrıca kullanıcıdan hedef metnini al (ör. "haftada 3 gün koşu"); metinde kaç kelime
         olduğunu say.
         */

        String[] gunler = {"Pzt","Sal","Car","Per","Cum","Cts","Paz"}; //günleri tutan dizi
        String[] antrenman = new String[7]; //antreman türlerini tutan dizi
        int[] dakika = new int[7]; //her gün için yapılan antreman türü
        Scanner sc = new Scanner(System.in); //kullanıcıdan  veri almak için

        int toplamKalori = 0;
        int maxKalori = 0;
        int maxGun = 0;
        int dinlenmeSayisi = 0;

        for(int i = 0; i < 7; i++) {

            System.out.print(gunler[i] + " günü antrenman türü gir: ");
            antrenman[i] = sc.nextLine(); //kullanıcıdan aldık

            System.out.print("Dakika gir: ");
            dakika[i] = sc.nextInt(); //kullanıcıdan aldık
            sc.nextLine();
            int kalori = 0;

            if(antrenman[i].equals("koşu")) {
                kalori = dakika[i] * 10;
            }
            else if(antrenman[i].equals("ağırlık")) {
                kalori = dakika[i] * 8;
            }
            else if(antrenman[i].equals("yüzme")) {
                kalori = dakika[i] * 11;
            }
            else if(antrenman[i].equals("dinlenme")) {
                kalori = 0;
                dinlenmeSayisi++;
            }

            toplamKalori = toplamKalori + kalori;

            if(kalori > maxKalori) {
                maxKalori = kalori;
                maxGun = i;
            }
        }

        System.out.println("Toplam kalori: " + toplamKalori);
        System.out.println("En çok kalori yakılan gün: " + gunler[maxGun]);
        System.out.println("Dinlenme gün sayısı: " + dinlenmeSayisi);

        System.out.print("Hedef metni gir: ");
        String hedef = sc.nextLine();

        int kelime = 1;

        for(int i = 0; i < hedef.length(); i++) {

            if(hedef.charAt(i) == ' ') {
                kelime++;
            }
        }

        System.out.println("Kelime sayısı: " + kelime);

    }
}
