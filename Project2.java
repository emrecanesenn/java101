import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double urunFiyati, kdvOrani, kdvTutari;
        System.out.println("--- KDV Hesaplama Programı ---");
        System.out.print("Ürünün Fiyatını Giriniz : ");
        urunFiyati = input.nextDouble();
        System.out.println("");
        kdvOrani = (urunFiyati >= 1000 ? 0.08 : 0.18);
        kdvTutari = urunFiyati * kdvOrani;
        System.out.println("KDV'siz Fiyat : " + urunFiyati + " TL");
        System.out.println("KDV Oranı : " + (kdvOrani == 0.18 ? "18%" : "8%"));
        System.out.println("KDV Tutarı : " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat : " + (urunFiyati + kdvTutari) + " TL");
        System.out.println("-------------------------------");
    }
}
