import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, enBuyuk = 0, enKucuk = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                } else if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        scanner.close();
    }
}
