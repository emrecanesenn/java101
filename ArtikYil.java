import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.println("----- Artık Yıl Hesaplama -----");
        
        System.out.print("Yıl Giriniz : ");
        yil = scanner.nextInt();
        
        System.out.println("\nGirdiğiniz yıl: " + (yil % 400 == 0 ? "Artık yıldır." : "Artık yıl değildir."));
        System.out.println("----- Artık Yıl Hesaplama -----");
        
        scanner.close();
    }
}
