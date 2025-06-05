import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 20, 10, 10, 20, 5, 20, 5};

        Arrays.sort(sayilar);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(sayilar));

        if (sayilar.length == 0) {
            System.out.println("Dizi boş, frekans hesaplanamaz.");
            return;
        }

        int currentNumber = sayilar[0];
        int count = 0;

        System.out.println("\nFrekanslar:");

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == currentNumber) {
                count++;
            } else {
                System.out.println(currentNumber + " sayısı " + count + " kere tekrar etmiştir.");

                currentNumber = sayilar[i];
                count = 1;
            }
        }

        System.out.println(currentNumber + " sayısı " + count + " kere tekrar etmiştir.");
    }
}
