import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrom(int sayi) {
        int temp = sayi;
        int tersSayi = 0;
        
        while (temp != 0) {
            int kalan = temp % 10;
            tersSayi = (tersSayi * 10) + kalan;
            temp = temp / 10;
        }
        
        return sayi == tersSayi;
    }
}
