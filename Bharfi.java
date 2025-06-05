public class Bharfi {
    public static void main(String[] args) {

        String[][] bHarfi = new String[7][6];

        for(int row = 0; row < bHarfi.length; row++) {

            for(int coll = 0; coll < bHarfi[row].length; coll++) {
                if(coll == 0) {
                    bHarfi[row][coll] = "*";
                }
                else if (row == 0 || row == 6) {
                    if (coll == 5) {
                        bHarfi[row][coll] = " ";
                    } else bHarfi[row][coll] = "*";
                }
                else if (row == 3 ) {
                    if(coll == bHarfi[row].length - 1) {
                        bHarfi[row][coll] = " ";
                    } else bHarfi[row][coll] = "*";
                }
                else if (coll == 5) {
                    bHarfi[row][coll] = "*";
                }
                else {
                    bHarfi[row][coll] = " ";
                }
            }

        }

        for (String[] row : bHarfi) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
