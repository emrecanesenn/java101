import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Asal Sayılar (1-100) ----");
        
        System.out.print("2, ");
        
        for(int sayi = 3; sayi <= 100; sayi++) {
            boolean asalMi = true;
            for(int bolen = 2; bolen <= Math.sqrt(sayi); bolen++) {
                if(sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }
            if(asalMi) {
                System.out.print(sayi + ", ");
            }
        }
        
        System.out.println("\n---- Asal Sayılar Sonu ----");
        scanner.close();
    }
}
