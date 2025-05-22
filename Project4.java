import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km; double price;
        System.out.println("----- Taksimetre Programı -----");
        System.out.println("İndi Bindi = 20TL, Açılış Ücreti = 10TL\n");
        System.out.print("Lütfen km cinsinden gidilen yolu giriniz: ");
        km = input.nextInt();
        price = 10 + km * 2.20;
        System.out.println("Toplam Tutar: " + (price > 20 ? price : 20) + " TL");
        System.out.println("----- Taksimetre Programı -----");
    }
}
