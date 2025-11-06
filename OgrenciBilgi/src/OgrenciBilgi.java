/*
 * Ad Soyad: [Özgür Uluganyan]
 * Ogrenci No: [250541083]
 * Tarih: [26.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner; 

public class OgrenciBilgi {
    public static void main(String[] args) {
        /// Kullanicidan veri almak icin Scanner sinifi kullanildi.
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Adinizi Girin: " );
        String ad = input.nextLine();  // Kullanicidan ad bilgisi alindi.
        System.out.print("Soyadinizi Girin: ");
        String soyad = input.nextLine();  // Kullanicidan soyad bilgisi alindi.
        System.out.print("Ogrenci Numaraniz: ");
        int ogrenciNo = input.nextInt();  // Kullanicidan ogrencino bilgisi alindi.
        System.out.print("Yasiniz: ");
        int yas = input.nextInt();   // Kullanicidan yas bilgisi alindi
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();    // Kullanicidan gpa bilgisi alindi

        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

        // COZUMUNUZU BURAYA YAZIN
        System.out.printf("Ad Soyad: %s %s\n" , ad, soyad);
        System.out.printf("Ogrenci No: %d\n" , ogrenciNo);
        System.out.printf("Yas: %d\n" , yas);
        System.out.printf("GPA: %.2f\n" , gpa);

        if (gpa >= 2) {
            System.out.print("Durum: Basarili Ogrenci");
        }else{

            System.out.print("Basarisiz Ogrenci");
        }
            input.close();
    }
}
