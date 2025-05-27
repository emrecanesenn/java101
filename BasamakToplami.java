import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sayi;
        int toplam = 0;
        System.out.println("---- Basamak Toplamı ----");
        System.out.print("Bir Sayı Giriniz : ");
        sayi = scanner.nextLine();
        for(int i = 0 ; i < sayi.length() ; i++) {
            int basamak = sayi.charAt(i) - '0';
            toplam += basamak;
        }
        System.out.println("Toplam : " + toplam);
        System.out.println("---- Basamak Toplamı ----");
        scanner.close();
    }
}
