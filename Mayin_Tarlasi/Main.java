import java.util.Scanner; // Kullanıcıdan girdi almak için Scanner sınıfı
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenlerin tanımlanması
        int row,col, selectedRow, selectedCol;
        boolean gameSizePoint = false, selectedPoint = false;
        int gameBombNumber = 0;

        System.out.println("------------ Game Settings ------------");
        // Oyun boyutlarının kullanıcıdan alınması
        do {
            System.out.println(gameSizePoint ? "\nUyarı: Lütfen 2x2 veya daha büyük bir değer giriniz" : ""); // Oyun boyutunun 2x2'den küçük girilmesi durumunda verilmesi gereken hata

            System.out.print("Oyunun satır sayısını giriniz (Minimum 2): ");
            row = input.nextInt();

            System.out.print("Oyunun sütun sayısını giriniz (Minimum 2): ");
            col = input.nextInt();

            gameSizePoint = true; // Kullanıcıdan bir kere değer aldıktan sonra kontrol girdisini aktif eder.
        }while(row < 2 || col < 2);

        // Oyunun başlatılması ve oyunun hazır olduğuna dair mesaj gösterilmesi
        // Bomba sayısı hesaplanması
        gameBombNumber = (row*col) / 4;
        MineSweeper sweeper = new MineSweeper(row, col, gameBombNumber, true);

        // Oyun hakkında bilgilerin ekrana yazdırılması
        System.out.println("\n<-->");
        System.out.println("Oyunun Boyutları : (" + row + "x" + col + ")");
        System.out.println("Oyunda ki Bomba Sayısı : " + gameBombNumber);
        System.out.println("<-->\n");

        System.out.println("------------ Game Settings ------------");
        System.out.println();

        // Program Display üzerinden bombaların yerleştirilmesi
        sweeper.programDisplay(gameBombNumber, row, col);

        // Oyunun ilk arayüzü
        System.out.println("\n<<<< Game Interface >>>>\n");
        sweeper.playerDisplay();
        System.out.println("\n<<<< Gameplay Section >>>>");
        do {
            if(selectedPoint) {
                System.out.println("Uyarı: Lütfen geçerli bir hücre sayısı giriniz!!"); // Oyun boyutundan yüksek veya alçak bir değer girilmesi durumunda verilmesi gereken hata
            }

            // Hücre seçimi
            System.out.print("Seçmek istediğiniz hücrenin satırını giriniz: ");
            selectedRow = input.nextInt();
            System.out.print("Seçmek istediğiniz hücrenin sütununu giriniz: ");
            selectedCol = input.nextInt();
            System.out.println();

            // Hücre seçimi kontrolü
            if((selectedRow > row || selectedCol > col) || (selectedRow < 1 || selectedCol < 1)) {
                selectedPoint = true;
                continue;
            }
            else selectedPoint = false;

            // Seçilen hücrenin simge kontrolü
            String symbol = sweeper.programDisplay[selectedRow - 1][selectedCol - 1];
            if(symbol.equals("*")) {
                sweeper.selected(selectedRow, selectedCol, symbol);
                break;
            }
            else if(symbol.equals("_")) {
                sweeper.selected(selectedRow, selectedCol, symbol);
            } else {
                System.out.println("MineSweeper: Bu hücreyi daha önce seçtiniz!!");
                sweeper.playerDisplay();
            }
            System.out.println();

        }while(!sweeper.isWon());



        input.close();
    }
}
