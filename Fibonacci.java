import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();
        
        long ilkSayi = 0;
        long ikinciSayi = 1;
        
        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");
        
        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(ilkSayi + " ");
            
            long toplam = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;
        }
        
        scanner.close();
    }
}
