public class MatrisTranspozu {

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] originalMatrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int originalRows = originalMatrix.length;
        int originalCols = originalMatrix[0].length;

        int[][] transposedMatrix = new int[originalCols][originalRows];

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("Matris : ");
        printMatrix(originalMatrix);

        System.out.println("\nTranspoze : ");
        printMatrix(transposedMatrix);
    }
}
