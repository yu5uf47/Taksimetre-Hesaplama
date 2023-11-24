public class dc {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        System.out.print("Kullanıcı Adını Giriniz: ");
        String kullaniciAdi = scanner.nextLine(); // kullanıcı adı = taksimetre
        System.out.print("Şifre Giriniz: ");
        String sifre = scanner.next(); // şifre = 123

        if (girisKontrol(kullaniciAdi, sifre)) {
            menu();
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış!");
        }
        scanner.close();
    }

    public static boolean girisKontrol(String _kullaniciAdi, String _sifre) {
        boolean result = _kullaniciAdi.equalsIgnoreCase("taksimetre") && _sifre.equals("123");
        return result;
    }

    public static double taksimetreHesapla(double km) {
        int acilisUcreti = 10;
        int mesafeBasi = 100;
        double mesafeUcreti = 0.65;
        double ucret = (km * 1000) / mesafeBasi * mesafeUcreti + acilisUcreti;
        return ucret;
    }

    public static void menu() {
        double[] ilcelerArasiMesafe = { 66.6, 35.5, 38.7, 40.7, 9.8, 28.3 };
        String[] hareketMerkezleri = { "Akkışla", "Bünyan", "Develi", "Felahiye", "Hacılar", "İncesu" };
        int i = 0;
        for (String hareketMerkezi : hareketMerkezleri) {
            System.out.println((i + 1) + ") " + hareketMerkezi + " -> " + ilcelerArasiMesafe[i] + " km");
            i++;
        }
        System.out.print("Gideceğiniz yeri seçiniz: ");
        int secim = scanner.nextInt();
        double tutar = 0.0;
        switch (secim) {
            case 1:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[0]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            case 2:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[1]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            case 3:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[2]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            case 4:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[3]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            case 5:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[4]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            case 6:
                tutar = taksimetreHesapla(ilcelerArasiMesafe[5]);
                System.out.printf("Taksimetre Tutarı : %.2f TL", tutar);
                break;
            default:
                System.out.println("Yanlış aralıkta bir seçim yaptınız. Lütfen 1-6 arasında seçim yapınız.");
        }

    }
}

