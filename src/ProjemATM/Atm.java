package ProjemATM;

import java.util.Scanner;

public class Atm {


    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza hozgeldiniz.....");
        System.out.println("****************************");
        System.out.println("Kullanici Girisi");
        System.out.println("****************************");
        int girisHakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giris Basarili.....");
                break;

                } else if (girisHakki > 0) {
           // } else if {
                System.out.println("Giris basarisiz ..:");
                girisHakki -= 1;
                System.out.println("Kalan giris hakki :" + girisHakki);

            }else{
                System.out.println((girisHakki == 0) );
                    System.out.println("Giris hakkiniz sonlandi");
                    return;
                }

            }
            System.out.println("*******************************");
            String islemler = "1. Bakiye Goruntule \n"
                    + "2. Para Yatrima \n"
                    + "3. Para Cekme \n"
                    + "4. Cikis icin q'ya basin";
            System.out.println(islemler);
            System.out.println("*******************************");
            while (true) {
                System.out.println("islemi seciniz : ");
                String islem = scanner.nextLine();
                if (islem.equals("q")) {
                    break;

                } else if (islem.equals("1")) {
                    System.out.println("Bakiyeniz : " + hesap.getBakiye());

                } else if (islem.equals("2")) {
                    System.out.println("yatirmak istediginiz tutar : ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraYatir(tutar);

                } else if (islem.equals("3")) {
                    System.out.println("cekmek istedgniz tutar : ");
                    int tutar = scanner.nextInt();
                    hesap.paraCek(tutar);

                } else if(islem.equals("4")){
                    System.out.println("cikis icin q'ya basinizz..");
                }
            }

        }
    }

