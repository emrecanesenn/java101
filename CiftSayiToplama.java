import java.util.Scanner;

public class CiftSayiToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            }
            
        } while (sayi % 2 == 0); // Tek sayı girilene kadar devam et
        
        System.out.println("Girilen 4'ün katı olan sayıların toplamı: " + toplam);
        
        scanner.close();
    }
}
