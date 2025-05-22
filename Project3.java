import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1, kenar2; double hipotenus;
        System.out.println("--- Hipotenüs Hesaplayıcı ---");
        System.out.print("1. Kenarı giriniz : ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        kenar2 = input.nextInt();
        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs : " + hipotenus);
        System.out.println("-------------------------");

        int a, b, c;
        System.out.println("--- Alan Hesaplayıcı ---");
        System.out.print("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c = input.nextInt();
        int u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı : " + alan);
        System.out.println("-------------------------");


    }
}
