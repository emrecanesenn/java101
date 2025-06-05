import java.util.Scanner;

public class RecursiveAsal {
    public static String hesapla(int sayi) {
        return asalKontrol(sayi, sayi - 1) ? "Asal sayıdır." : "Asal değildir.";
    }

    public static boolean asalKontrol(int sayi, int bolen) {
        // Temel durumlar (base cases)
        if (sayi <= 1) {
            return false; // 1 ve daha küçük sayılar asal değildir
        }
        if (bolen == 1) {
            return true; // Tüm bölenler kontrol edildi ve bölünemedi
        }
        
        // Eğer sayı bölen ile tam bölünüyorsa asal değildir
        if (sayi % bolen == 0) {
            return false;
        }
        
        // Recursive çağrı: bir sonraki böleni kontrol et
        return asalKontrol(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Asal Sayılar ----\n");

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        System.out.println("\nSonuç: " + hesapla(sayi));

        scanner.close();
    }
}
