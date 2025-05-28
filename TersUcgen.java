import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Ters Üçgen ----");
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        for(int i = sayi; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---- Ters Üçgen ----");
        scanner.close();
    }
}
