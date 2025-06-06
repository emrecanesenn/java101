import java.util.Arrays;
import java.util.Random;
public class MineSweeper {
    // Programın değişkenleri
    String[][] programDisplay;
    String[][] playerDisplay;
    boolean isDisplayed = false;
    boolean isWon = false;
    boolean isLost = false;
    int counter;

    // Programın kurucu metodu
    MineSweeper(int row,int col, int bombNumber, boolean isDisplayed) { // Satır - Sütun - Bomba Sayısı - Program Display Görünümü (Bomba Görünümü)
        this.counter = (row * col) - bombNumber; // Kazanmak için açılması gereken hücre sayısı
        this.isDisplayed = isDisplayed;
        this.programDisplay = new String[row][col];
        this.playerDisplay = new String[row][col];
    }

    public boolean isWon() {
        return this.isWon;
    }

    // Hücre seçimi sonrası dağılım ve yapılması gereken işlemler
    public void selected(int selectedRow, int selectedCol, String symbol) {
        selectedRow -= 1;
        selectedCol -= 1;
        if(symbol.equals("*")) {
            this.isLost = true;
            playerDisplayEdited(selectedRow, selectedCol);
        } else if(symbol.equals("_")) {
            playerDisplayEdited(selectedRow, selectedCol);
        } else return;
    }


    // Hücre seçiminin sonucunda yapılacak işlemler
    public void playerDisplayEdited(int row, int col) {
        if(isLost) { // Kaybetme durumu
            this.playerDisplay[row][col] = "*";
            playerDisplay();
            System.out.println("\nKaybettiniz!!");
        } else {
            counter--; // Açılması gereken kalan hücre sayısını azaltma
            int bombCounter = 0;
            if(row == 0) { // İlk satır kombinasyonları
                if(col == 0) {
                    bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row+1][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                }
                else if(col == playerDisplay[row].length - 1) {
                    bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row+1][col-1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                } else {
                    bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row+1][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row+1][col-1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                }
            }
            else if(row == playerDisplay.length - 1) { // Son satır kombinasyonları
                if(col == 0) {
                    bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row-1][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                }
                else if(col == playerDisplay[row].length - 1) {
                    bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row-1][col-1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                } else {
                    bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row-1][col+1].equals("*") ? 1 : 0;
                    bombCounter += this.programDisplay[row-1][col-1].equals("*") ? 1 : 0;
                    this.playerDisplay[row][col] = "" + bombCounter;
                    this.programDisplay[row][col] = "" + bombCounter;
                }
            } else if(col == 0) { // İlk sütun kombinasyonları
                bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row+1][col+1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row-1][col+1].equals("*") ? 1 : 0;
                this.playerDisplay[row][col] = "" + bombCounter;
                this.programDisplay[row][col] = "" + bombCounter;

            } else if(col == playerDisplay[row].length - 1) { // Son sütun kombinasyonları
                bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row+1][col-1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row-1][col-1].equals("*") ? 1 : 0;
                this.playerDisplay[row][col] = "" + bombCounter;
                this.programDisplay[row][col] = "" + bombCounter;

            } else { // Diğer sütunlar için kombinasyonlar
                bombCounter += this.programDisplay[row][col+1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row][col-1].equals("*") ? 1 : 0;

                bombCounter += this.programDisplay[row-1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row-1][col+1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row-1][col-1].equals("*") ? 1 : 0;

                bombCounter += this.programDisplay[row+1][col].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row+1][col+1].equals("*") ? 1 : 0;
                bombCounter += this.programDisplay[row+1][col-1].equals("*") ? 1 : 0;
                this.playerDisplay[row][col] = "" + bombCounter;
                this.programDisplay[row][col] = "" + bombCounter;
            }
            if(counter == 0) { // Kazanma durumunda olacak olan işlemler ve koşullar
                this.isWon = true;
                for(int i = 0; i < this.playerDisplay.length; i++) {
                    for(int j = 0; j < this.playerDisplay[i].length; j++) {
                        if(this.programDisplay[i][j].equals("*")) {
                            this.playerDisplay[i][j] = "*";
                        }
                    }
                }
                playerDisplay();
                if(this.isDisplayed) {
                    System.out.println("\nOyunu Bitti!!");
                    System.out.println("Hile Açık - Kaybettiniz!!");
                }else {
                    System.out.println("\nTebrikler!!");
                    System.out.println("Oyunu Kazandın!!");
                }
                return;
            }
            playerDisplay();
        }
    }


    // Oyunun program display'ına göre gösterilmesi için kullanılan metod
    public void programDisplay(int bombNumber, int row, int col) {
        Random rand = new Random();

        for(String[] rows: this.programDisplay) {
            Arrays.fill(rows, "_");
        }

        for(int count = 0; count < bombNumber; count++) {

            int rand1 = rand.nextInt(row);
            int rand2 = rand.nextInt(col);
            if(this.programDisplay[rand1][rand2].equals("*")) count--;
            else this.programDisplay[rand1][rand2] = "*";
        }


        // Eğer program display gösterilmek isteniyorsa, gösterilen arayüz
        if(this.isDisplayed) {
            System.out.println("<<<< Display Hack >>>>\n");
            for(int i = 0; i < this.programDisplay.length; i++) {
                if(i == 0) {
                    System.out.print("*  ");
                    for(int column = 0; column < this.programDisplay[i].length; column++) {
                        System.out.print((column + 1 ) + " ");
                    }
                    System.out.println();
                }
                System.out.print((i+1) + "  ");
                for(int j = 0; j < this.programDisplay[i].length; j++) {
                    System.out.print(this.programDisplay[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Oyunun kullanıcı display'ına göre gösterilmesi için kullanılan metod
    public void playerDisplay() {

        if (this.playerDisplay[0][0] == null) { // İlk çalıştırılması için

            for (String[] row : this.playerDisplay) {
                Arrays.fill(row, "_");
            }

        }

        // Eğer kullanıcı display gösterilmek isteniyorsa, gösterilen arayüz
        for(int i = 0; i < this.playerDisplay.length; i++) {
            if(i == 0) {
                System.out.print("*  ");
                for(int column = 0; column < this.playerDisplay[i].length; column++) {
                    System.out.print((column + 1 ) + " ");
                }
                System.out.println();
            }
            System.out.print((i+1) + "  ");
            for(int j = 0; j < this.playerDisplay[i].length; j++) {
                System.out.print(this.playerDisplay[i][j] + " ");
            }
            System.out.println();
        }

    }

}
