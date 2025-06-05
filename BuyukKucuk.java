import java.util.Scanner;

public class BuyukKucuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.println("----- Küçük Büyük -----");
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = scanner.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        sayi3 = scanner.nextInt();
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println(sayi1 + "(Sayı-1) <= " + sayi2 + "(Sayı-2) <= " + sayi3 + "(Sayı-3)");
            } else {
                System.out.println(sayi1 + "(Sayı-1) <= " + sayi3 + "(Sayı-3) <= " + sayi2 + "(Sayı-2)");
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println(sayi2 + "(Sayı-2) <= " + sayi1 + "(Sayı-1) <= " + sayi3 + "(Sayı-3)");
            } else {
                System.out.println(sayi2 + "(Sayı-2)" + sayi3 + "(Sayı-3) <= " + sayi1 + "(Sayı-1)");
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println(sayi3 + "(Sayı-3) <= " + sayi1 + "(Sayı-1) <= " + sayi2 + "(Sayı-2)");
            } else {
                System.out.println(sayi3 + "(Sayı-3) <= " + sayi2 + "(Sayı-2) <= " + sayi1 + "(Sayı-1)");
            }
        }
        System.out.println("----- Küçük Büyük -----");
        scanner.close();
    }
}
