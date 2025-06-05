import java.util.Scanner;

public class DonguOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Döngüler -----");
        int sayi, ortalama, toplam = 0, sayac = 0;
        System.out.print("Sayı Giriniz : ");
        sayi = scanner.nextInt();
        for(int i = 0; i <= sayi; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                System.out.println(i + ", ");
                toplam += i;
                sayac++;
            };
        }
        ortalama = toplam / sayac;
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması : " + ortalama);
        System.out.println("----- Döngüler -----");

        scanner.close();
    }
}
