import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("----- Vücut Kitle İndeks Hesaplayan Program (BMI) -----");
        System.out.print("Lütfen Boyunuzu (metre cinsinden) giriniz : ");
        double boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu giriniz : ");
        double kilo = input.nextDouble();
        double bmi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
        System.out.println("----- Vücut Kitle İndeks Hesaplayan Program (BMI) -----");
    }
}
