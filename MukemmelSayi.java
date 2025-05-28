import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        // Pozitif bölenlerinin toplamını tutacak değişken
        int toplam = 0;
        
        int i = 1;
        while (i <= sayi/2) {
            if (sayi % i == 0) {
                toplam += i;
            }
            i++;
        }
        
        // Toplam sayıya eşitse mükemmel sayıdır
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
        
        scanner.close();
    }
}
