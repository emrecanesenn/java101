import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ay, gun;
        System.out.println("----- Burç Bulma Programı -----");
        System.out.print("Doğduğunuz Ayı Giriniz (1-12): ");
        ay = scanner.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz (1-31): ");
        gun = scanner.nextInt();
        if((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) System.out.println("Burcunuz: Kova");
        else if((ay == 2) || (ay == 3 && gun <= 20)) System.out.println("Burcunuz: Balık");
        else if((ay == 3) || (ay == 4 && gun <= 20)) System.out.println("Burcunuz: Koç");
        else if((ay == 4) || (ay == 5 && gun <= 21)) System.out.println("Burcunuz: Boğa");
        else if((ay == 5) || (ay == 6 && gun <= 22)) System.out.println("Burcunuz: İkizler");
        else if((ay == 6) || (ay == 7 && gun <= 22)) System.out.println("Burcunuz: Yengeç");
        else if((ay == 7) || (ay == 8 && gun <= 22)) System.out.println("Burcunuz: Aslan");
        else if((ay == 8) || (ay == 9 && gun <= 22)) System.out.println("Burcunuz: Başak");
        else if((ay == 9) || (ay == 10 && gun <= 22)) System.out.println("Burcunuz: Terazi");
        else if((ay == 10) || (ay == 11 && gun <= 21)) System.out.println("Burcunuz: Akrep");
        else if((ay == 11) || (ay == 12 && gun <= 21)) System.out.println("Burcunuz: Yay");
        else if((ay == 12) || (ay == 1)) System.out.println("Burcunuz: Oğlak");
        else System.out.println("Hatalı gün veya ay girildi!");
        System.out.println("----- Burç Bulma Programı -----");
        scanner.close();
    }
}
