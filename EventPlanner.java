import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Etkinlik Planlayıcı -----");
        System.out.println("Etkinlik Planlayıcıya Hoş Geldiniz!");
        System.out.print("Lütfen sıcaklık değerini giriniz (°C): ");
        double sicaklik = scanner.nextDouble();

        boolean kayakUygun = sicaklik < 5;
        boolean sinemaUygun = sicaklik >= 5 && sicaklik <= 15;
        boolean piknikUygun = sicaklik >= 10 && sicaklik <= 25;
        boolean yuzmeUygun = sicaklik > 25;

        if (kayakUygun) {
            System.out.println("Öneri: Kayak yapmaya gidebilirsiniz.");
        }
        if (sinemaUygun) {
            System.out.println("Öneri: Sinemaya gidebilirsiniz.");
        }
        if (piknikUygun) {
            System.out.println("Öneri: Piknik yapmaya gidebilirsiniz.");
        }
        if (yuzmeUygun) {
            System.out.println("Öneri: Yüzmeye gidebilirsiniz.");
        }

        System.out.println("----- Etkinlik Planlayıcı -----");
        scanner.close();
    }
}
