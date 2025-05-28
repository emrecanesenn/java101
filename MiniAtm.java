import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        int hak = 3, bakiye = 2000, select;
        System.out.println("--- SchedarpBANK'a Hoşgeldiniz ---");
        do {
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
            username = scanner.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            password = scanner.nextLine();
            if (username.equals("schedarp") && password.equals("sifre123")) break;
            else {
                System.out.println("Hatalı Giriş Yaptınız!");
                hak--;
            }
        } while(hak > 0);
        switch(hak) {
            case 0:
                System.out.println("Hesabınız Hatalı Deneme Sonucu Bloke Edilmiştir!");
                return;
            default:
                do {
                    System.out.println("\nHoşgeldiniz Yapmak İstediğiniz İşlemi Seçiniz");
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yap");
                    System.out.print("Seçiminiz : ");
                    select = scanner.nextInt();
                    switch(select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Miktarı Giriniz : ");
                            int yatirma = scanner.nextInt();
                            bakiye += yatirma;
                            System.out.println("Yatırma Başarılı!\nYeni Bakiye : " + bakiye + "\n");
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Miktarı Giriniz : ");
                            int cekme = scanner.nextInt();
                            if (cekme > bakiye) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            }
                            else {
                                bakiye -= cekme;
                                System.out.println("Para Çekme İşlemi Başarılı!\nYeni Bakiye : " + bakiye + "\n");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye + "\n");
                            break;
                        case 4:
                            System.out.println("\n--- Tekrar Görüşmek Üzere! ---");
                            break;
                        default:
                            System.out.println("İşlem Başarısız!\n");
                            break;
                    }
                } while(select != 4);
                break;
        }
        scanner.close();
    }
}
