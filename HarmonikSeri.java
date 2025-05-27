import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Harmonik Seri Hesaplama ----");

        int n;
        do {
            System.out.print("Serinin kaçıncı terime kadar hesaplanacağını girin (n): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Lütfen pozitif bir sayı girin!");
            }
        } while (n <= 0);

        double toplam = 0.0;

        for (int i = 1; i <= n; i++) {
            toplam += (1.0 / i);
        }

        System.out.println(n + ". terime kadar olan harmonik seri toplamı: " + toplam);

        scanner.close();
    }
}
