import java.util.Scanner;
public class Project8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, islem;
        System.out.println("----- Hesap Makinesi -----");
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        islem = input.nextInt();
        switch(islem){
            case 1 : {
                System.out.println("Sonuç: " + (sayi1 + sayi2));
                break;
            }
            case 2 : {
                System.out.println("Sonuç: " + (sayi1 - sayi2));
                break;
            }
            case 3 : {
                System.out.println("Sonuç: " + (sayi1 * sayi2));
                break;
            }
            case 4 : {
                if(sayi2 != 0) {
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                }
                else {
                    System.out.println("Bölen Sayı 0 olamaz!");
                }
                break;
            }
            default : {
                System.out.println("Lütfen geçerli bir işlem seçiniz!");
                break;
            }
        }
        System.out.println("----- Hesap Makinesi -----");
    }
}
