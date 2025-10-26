/* Ad Soyad: [Özgür Uluganyan]
 * Ogrenci No: [250541083]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */


import java.util.Scanner;

public class MaasHesap {
    static void main(String[] args) {

        /// Kullanicidan veri almak icin Scanner sinifi kullanildi.
        Scanner input = new Scanner(System.in);
        System.out.print("Adiniz: ");
        String ad = input.nextLine();        // Kullanicidan ad bilgisi alindi.
        System.out.print("Soyadiniz: ");
        String soyad = input.nextLine();     // Kullanicidan soyad bilgisi alindi.
        System.out.print("Aylik Brut Maasinizi Giriniz: ");
        double brutMaas = input.nextDouble();    // Kullanicidan Brut Maas bilgisi alindi.
        System.out.print("Haftalik Calisma Saatinizi Giriniz: ");
        int haftalıkSaat = input.nextInt();     // Kullanicidan Haftalik Calisma Saati  bilgisi alindi.
        System.out.print("Mesai Saatinizi Giriniz: ");
        int mesaiSaati = input.nextInt();   // Kullanicidan Mesai Saati bilgisi alindi.

        // Kacis karakterleri: \t ve \n
        // \t: Sekme(bosluk) birakir.
        // \n: Yeni satira gecer.

        System.out.println("\n\n====================================");
        System.out.println("\t\t\tMAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s %s\n" , ad , soyad);

        System.out.println("\nGELIRLER:");
        System.out.printf("\tBrut Maas\t\t\t: %.2f" ,brutMaas);
        System.out.print(" TL");
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        System.out.printf("\n\tMesai Ucreti\t\t:  %.2f"  , mesaiUcreti);
        System.out.println(" TL");
        double toplamGelir = brutMaas + mesaiUcreti;
        System.out.println("\t---------------------");
        System.out.printf("\tTOPLAM GELIR\t\t: %.2f" , toplamGelir);
        System.out.println(" TL");

        /// SABIT DEEGERLER
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        ///  KESINTI HESAPLAMALARI
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi +  gelirVergisi + damgaVergisi;

        /// NET MAAS HESAPLAMASI
        double netMaas = toplamGelir -  toplamKesinti;

        System.out.println("\nKESINTILER:");
        System.out.printf("\tSGK Kesintisi\t\t:  %.2f" , sgkKesintisi);
        System.out.println(" TL");
        System.out.printf("\tGelir Vergisi\t\t:  %.2f" ,gelirVergisi);
        System.out.println(" TL");
        System.out.printf("\tDamga Vergisi\t\t:   %.2f" , damgaVergisi);
        System.out.println(" TL");
        System.out.println("\t--------------------");
        System.out.printf(" TOPLAM KESINTI\t\t\t:  %.2f" , toplamKesinti);
        System.out.println(" TL");
        System.out.printf("NET MAAS\t\t\t\t: %.2f" ,  netMaas);
        System.out.println(" TL ");
        System.out.println("=====================================\n");

        /// HESAPLANACAK ISTATISTIKLER
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatliknetKazanc = netMaas / 176;//saat
        double gunluknetKazanc = netMaas / 22;//gun

        System.out.printf("Kesinti Orani: %.2f\n" ,  kesintiOrani );
        System.out.printf("Saatlik Net Kazanc: %.2f" , saatliknetKazanc);
        System.out.print(" TL\n");
        System.out.printf("Gunluk Net Kazanc: %.2f", gunluknetKazanc);
        System.out.print(" TL");

        input.close();


    }
}
