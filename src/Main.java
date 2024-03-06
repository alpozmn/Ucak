import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alın
        System.out.println("Mesafeyi (KM) girin:");
        int mesafe = scanner.nextInt();

        System.out.println("Yaşınızı girin:");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş):");
        int yolculukTipi = scanner.nextInt();

        // Girdilerin geçerliliğini kontrol edin
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Bilet fiyatını hesaplayın (mesafe * 0.10 TL)
        double biletFiyati = mesafe * 0.10;

        // İndirimleri uygulayın
        if (yas < 12) {
            // 12 yaşından küçükse %50 indirim
            biletFiyati *= 0.5;
        } else if (yas >= 12 && yas <= 24) {
            // 12-24 yaş arasındaysa %10 indirim
            biletFiyati *= 0.9;
        } else if (yas >= 65) {
            // 65 yaşından büyükse %30 indirim
            biletFiyati *= 0.7;
        }

        if (yolculukTipi == 2) {
            // Gidiş-dönüş seçilmişse %20 indirim
            biletFiyati *= 0.8;
        }

        // Toplam bilet fiyatını yazdırın
        System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL");
    }
}
