import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double sumOfReciprocals = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfReciprocals += (1.0 / numbers[i]);
        }

        double harmonicAverage = numbers.length / sumOfReciprocals;

        System.out.println("Dizideki elemanlar: " + Arrays.toString(numbers));
        System.out.println("Harmonik Seri Toplamı: " + sumOfReciprocals);
        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
