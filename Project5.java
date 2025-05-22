import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("----- Daire Alanı ve Çevre Hesaplayıcı -----");
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz : ");
        double r = input.nextDouble();
        System.out.print("Lütfen Dairenin Merkez Açısını Giriniz :");
        double a = input.nextDouble();
        double alan = pi * r * r;
        System.out.println("\nDairenin Alanı : " + alan);
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi : " + cevre);
        double dilimAlani = (alan * a) / 360;
        System.out.println("Daire Diliminin Alanı : " + dilimAlani);
        System.out.println("----- Daire Alanı ve Çevre Hesaplayıcı -----");
    }
}
