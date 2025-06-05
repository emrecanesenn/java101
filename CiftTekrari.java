import java.util.Arrays;
public class CiftTekrari {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 12, 7, 25, 12, 30, 7, 4, 40, 12, 50, 4};

        int[] duplicateEvenNumbers = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                if (!isFind(duplicateEvenNumbers, arr[i])) {

                    for (int j = 0; j < arr.length; j++) {
                        if ((i != j) && (arr[i] == arr[j])) {
                            duplicateEvenNumbers[startIndex++] = arr[i];
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: ");
        for (int value : duplicateEvenNumbers) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}
