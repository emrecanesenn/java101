import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını (n) giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Seçilecek eleman sayısını (r) giriniz: ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0) {
            System.out.println("Hata: n ve r değerleri negatif olamaz!");
        } else if (r > n) {
            System.out.println("Hata: r değeri n değerinden büyük olamaz! (Seçilecek eleman sayısı toplam eleman sayısından fazla olamaz)");
        } else {
            long nFaktoriyel = 1;
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }

            long rFaktoriyel = 1;
            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }

            int nMinusR = n - r;
            long nMinusRFaktoriyel = 1;
            for (int i = 1; i <= nMinusR; i++) {
                nMinusRFaktoriyel *= i;
            }


            long kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }

        scanner.close();
    }
}
