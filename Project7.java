import java.util.Scanner;
public class Project7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11 , muzFiyat = 0.95, patlicanFiyat = 5.00;
        System.out.println("----- MANAV -----");
        System.out.print("Kaç kilo armut almak istiyorsunuz ? : ");
        int armutKilo = input.nextInt();
        System.out.print("Kaç kilo elma almak istiyorsunuz ? : ");
        int elmaKilo = input.nextInt();
        System.out.print("Kaç kilo domates almak istiyorsunuz ? : ");
        int domatesKilo = input.nextInt();
        System.out.print("Kaç kilo muz almak istiyorsunuz ? : ");
        int muzKilo = input.nextInt();
        System.out.print("Kaç kilo patlıcan almak istiyorsunuz ? : ");
        int patlicanKilo = input.nextInt();
        double toplam = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.println("\nToplam Tutar : " + toplam + " TL");
        System.out.println("----- MANAV -----");
    }
}
