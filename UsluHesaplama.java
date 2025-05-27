import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 1, us;
        System.out.println("---- Üslü Hesaplama ----");
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        System.out.print("Sayının üs değerini giriniz: ");
        us = scanner.nextInt();
        for (int i = 1; i <= us; i++) {
            toplam *= sayi;
        };
        System.out.println("Sonuç: " + toplam);
        System.out.println("---- Üslü Hesaplama ----");
        scanner.close();
    }
}
