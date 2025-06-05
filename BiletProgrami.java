import java.util.Scanner;

public class BiletProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km, yas, yolculukTuru; double biletFiyati, indirimsizBiletFiyati;
        System.out.println("----- Burç Bulma Programı -----");
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scanner.nextInt();
        if(km <= 0) {System.out.println("Mesafe negatif bir değer içeriyor!"); return;}
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk Türü (1-Tek Yön, 2-Gidiş Dönüş): ");
        yolculukTuru = scanner.nextInt();
        switch(yolculukTuru) {
            case 1:
                biletFiyati = km * 0.10;
                indirimsizBiletFiyati = biletFiyati;
                break;
            case 2:
                biletFiyati = (km * 0.10) * 2;
                indirimsizBiletFiyati = biletFiyati;
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                return;
        }

        if(yas < 12 && yas > 0) biletFiyati -= (biletFiyati * 0.5);
        else if (yas <= 24) biletFiyati -= (biletFiyati * 0.1);
        else if (yas > 65) biletFiyati -= (biletFiyati * 0.3);
        else System.out.println("Lütfen yaş değerini pozitif giriniz!");

        biletFiyati -= yolculukTuru == 2 ? (biletFiyati * 0.2) : 0;

        System.out.println("--- Bilet Bilgileri ---");
        System.out.println("Uçacağınız Mesafe: " + km);
        System.out.println("Yaşınız: " + yas);
        System.out.println("Yolculuk Türü: " + (yolculukTuru == 1 ? "Tek Yön" : "Gidiş Dönüş") + "\n");

        System.out.println("Toplam Tutar: " + indirimsizBiletFiyati + " TL");
        System.out.println("Toplam İndirim Tutarı: " + (indirimsizBiletFiyati - biletFiyati) + " TL");
        System.out.println("İndirimli Bilet Fiyatı: " + biletFiyati + " TL");
        System.out.println("--- Bilet Bilgileri ---");


        scanner.close();
    }
}
