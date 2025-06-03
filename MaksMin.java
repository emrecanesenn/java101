import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Arrays.sort(list);

        System.out.print("--- Dizide ki elemanlar --- \n=> ");
        for(int eleman: list) {
            System.out.print(eleman + " ");
        }
        System.out.print("\nLütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        int enKucuk = list[0];
        int enBuyuk = list[list.length - 1];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < sayi) {
                enKucuk = list[i];
            } else if (list[i] > sayi) {
                enBuyuk = list[i];
                break;
            } else {
                enKucuk = sayi;
                enBuyuk = sayi;
                break;
            }
        }

        System.out.println("---- En Yakın Küçük ve Büyük Sayılar ----");
        System.out.println(sayi + " sayısına yakın en küçük sayı: " + enKucuk);
        System.out.println(sayi + " sayısına en yakın en büyük sayı: " + enBuyuk);

        input.close();
    }
}
