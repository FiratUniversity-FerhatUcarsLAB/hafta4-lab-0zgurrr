/* Ad Soyad: [Özgür Uluganyan]
 * Ogrenci No: [250541083]
 * Tarih: [26.10.2025]
 * Aciklama: Gorev 2 - Geometrik Hesap
 *
 * Bu program kullanicidan bilgilerini alir ve hesaplamalar yaparak
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner; 

public class GeometrikHesap {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin Yaricapini Girin (cm): ");

        // HESAPLAMALAR
        final double PI = 3.14159;

        double yaricap =  input.nextDouble();
        double alan = PI * Math.pow(yaricap, 2);
        double cevre = 2* PI* yaricap;
        double cap = 2 * yaricap;
        double hacim = 4.0/3.0 * PI * Math.pow(yaricap, 3);
        double yuzeyAlani = 4 *PI * Math.pow(yaricap, 2);

        System.out.println("\nSONUCLAR:\n----------");
        System.out.printf("Dairenin Alani    : %.2f cm^2\n" , alan);
        System.out.printf("Dairenin Cevresi  : %.2f cm\n", cevre);
        System.out.printf("Dairenin Capi:    : %.2f cm\n" , cap);
        System.out.printf("Kure Hacmi:       : %.2f cm^3\n" , hacim);
        System.out.printf("Kure Yuzey Alani  : %.2f cm^2" , yuzeyAlani);

        input.close();
    }
}
