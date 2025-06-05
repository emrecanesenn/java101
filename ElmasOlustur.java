import java.util.Scanner;

public class ElmasOlustur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın boyutunu giriniz (tek sayı): ");
        int n = scanner.nextInt();
        
        // Üst yarım
        for (int i = 1; i <= n; i += 2) {
            // Boşlukları yazdır
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Alt yarım
        for (int i = n - 2; i >= 1; i -= 2) {
            // Boşlukları yazdır
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
