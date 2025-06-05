import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, kimya, turkce, tarih, muzik, ortalama;
        System.out.println("--- Not Ortalaması Hesaplayan Program ---");
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextDouble();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextDouble();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextDouble();
        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = input.nextDouble();
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextDouble();
        System.out.println("--------------------------------------");
        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız : " + ortalama + "\n");
        System.out.println("Durum: " + (ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı"));
        System.out.println("--------------------------------------");

    }
}
