import java.util.Scanner;

public class Main {
    // Recursive metot
    static void recursivePattern(int n) {
        // Önce sayıyı yazdır
        System.out.print(n + " ");

        // Temel durum (Base case) - sayı 0 veya negatifse geri dön
        if (n <= 0) {
            return;
        }

        // Recursive çağrı - 5 azaltarak devam et
        recursivePattern(n - 5);

        // Geri dönüş yolunda sayıyı yazdır
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = scanner.nextInt();
        
        System.out.print("Çıktısı: ");
        recursivePattern(n);
        
        scanner.close();
    }
}
