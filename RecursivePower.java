import java.util.Scanner;

public class RecursivePower {
    public static int hesapla(int base, int power) {
        if(power == 0) return 1;
        else return base * hesapla(base, power - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Üslü Sayı Hesaplayan Program ----\n");

        System.out.print("Taban Değerini Giriniz : ");
        int base = scanner.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int power = scanner.nextInt();

        System.out.println("\nSonuç: " + hesapla(base, power));

        scanner.close();
    }
}
