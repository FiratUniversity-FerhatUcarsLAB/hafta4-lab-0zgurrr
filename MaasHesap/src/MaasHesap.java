/* Ad Soyad: [Özgür Uluganyan]
 * Ogrenci No: [250541083]
 * Tarih: [26.10.2025]
 * Aciklama: Gorev 3 - Maas Hesap
 *
 * Bu program kullanicidan bilgilerini alir ve hesaplamalar yaparak
 * duzenli bir formatta ekrana yazdirir.
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
        System.out.printf("\tBrut Maas\t\t\t: %.2f TL\n" ,brutMaas);
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        System.out.printf("\tMesai Ucreti\t\t:  %.2f TL\n"  , mesaiUcreti);
        double toplamGelir = brutMaas + mesaiUcreti;
        System.out.println("\t---------------------");
        System.out.printf("\tTOPLAM GELIR\t\t: %.2f TL\n" , toplamGelir);

        /// SABIT DEGERLER
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
        System.out.printf("\tSGK Kesintisi\t\t:  %.2f TL\n" , sgkKesintisi);
        System.out.printf("\tGelir Vergisi\t\t:  %.2f TL\n" ,gelirVergisi);
        System.out.printf("\tDamga Vergisi\t\t:   %.2f TL\n" , damgaVergisi);
        System.out.println("\t--------------------");
        System.out.printf(" TOPLAM KESINTI\t\t\t:  %.2f TL\n" , toplamKesinti);
        System.out.printf("NET MAAS\t\t\t\t: %.2f TL\n" ,  netMaas);
        System.out.println("=====================================\n");

        /// HESAPLANACAK ISTATISTIKLER
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatliknetKazanc = netMaas / 176;//saat
        double gunluknetKazanc = netMaas / 22;//gun

        System.out.printf("Kesinti Orani: %.2f\n" ,  kesintiOrani );
        System.out.printf("Saatlik Net Kazanc: %.2f TL\n" , saatliknetKazanc);
        System.out.printf("Gunluk Net Kazanc: %.2f TL\n", gunluknetKazanc);

        input.close();


    }
}
