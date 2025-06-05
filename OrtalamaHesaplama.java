import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matematik, fizik, turkce, kimya, muzik, toplam = 0;
        int ders = 0;
        
        System.out.println("----- Ders Paneli -----");
        
        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();
        toplam += (matematik >= 0 && matematik <= 100) ? matematik : 0;
        ders = (matematik >= 0 && matematik <= 100) ? ++ders : ders;
        
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        toplam += (fizik >= 0 && fizik <= 100) ? fizik : 0;
        ders = (fizik >= 0 && fizik <= 100) ? ++ders : ders;
        
        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();
        toplam += (turkce >= 0 && turkce <= 100) ? turkce : 0;
        ders = (turkce >= 0 && turkce <= 100) ? ++ders : ders;
        
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        toplam += (kimya >= 0 && kimya <= 100) ? kimya : 0;
        ders = (kimya >= 0 && kimya <= 100) ? ++ders : ders;
        
        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();
        toplam += (muzik >= 0 && muzik <= 100) ? muzik : 0;
        ders = (muzik >= 0 && muzik <= 100) ? ++ders : ders;
        
        double ortalama = ders > 0 ? toplam / ders : 0;
        
        System.out.println("Ortalamanız: " + ortalama);
        if(ortalama >= 50) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız.");
        }
        
        System.out.println("----- Ders Paneli -----");
    }
}
