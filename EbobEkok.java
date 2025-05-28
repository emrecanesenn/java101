import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        
        int n1 = sayi1;
        int n2 = sayi2;
        
        while (n2 != 0) {
            int kalan = n1 % n2;
            n1 = n2;
            n2 = kalan;
        }
        int ebob = n1;
        
        int ekok = (sayi1 * sayi2) / ebob;
        
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının;");
        System.out.println("EBOB değeri: " + ebob);
        System.out.println("EKOK değeri: " + ekok);
        
        scanner.close();
    }
}
