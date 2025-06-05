import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        System.out.println("----- Kullanıcı Paneli -----");
        System.out.print("Kullanıcı Adını Giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        sifre = input.nextLine();
        if(kullaniciAdi.equals("Schedarp") && sifre.equals("birikiuc")) {
            System.out.println("Giriş Başarılı!");
        } else if (!sifre.equals("birikiuc") && kullaniciAdi.equals("Schedarp")) {
            System.out.println("Şifreniz Hatalı!");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz ? (E/H) : ");
            String cevap = input.nextLine();
            if(cevap.equals("E") || cevap.equals("e")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                sifre = input.nextLine();
                if(sifre.equals("birikiuc")) {
                    System.out.println("Şifre Sıfırlama Başarısız!");
                }
                else {
                    System.out.println("Şifre Sıfırlama Başarılı!");
                }
            }
        }
        else {
            System.out.println("Giriş Başarısız!");
        }
        System.out.println("----- Kullanıcı Paneli -----");
    }
}
