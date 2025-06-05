import java.util.Scanner;

public class Zodyak{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil, zodyak;
        System.out.println("----- Zodyak Bulma Programı -----");
        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = scanner.nextInt();
        zodyak = yil % 12;
        System.out.print("Zodyak burcunuz: ");
        switch (zodyak) {
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");

        }
        System.out.println("----- Zodyak Bulma Programı -----");

        scanner.close();
    }
}
