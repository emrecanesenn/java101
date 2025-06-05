import java.util.Arrays;
import java.util.Scanner;
public class Project10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı Giriniz: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("---- Sıralanmış Liste ----");
        for(int siralama: arr) {
            System.out.println("-> " + siralama);
        }

    }
}
