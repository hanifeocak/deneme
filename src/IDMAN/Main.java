package IDMAN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman Programina hosgeldiniz.....");
        String idmanlar = "Gecerli Hareketler....\n"
                + "Burpee\n" + "Pushup(Sinav)\n" + "Situp(Mekik)\n" + "Squat\n";
        System.out.println("idmanlar :");
        System.out.println("Bir idman olusturun...");
        System.out.println("Burpee Sayisi : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayisi : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayisi : ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayisi : ");
        int squat = scanner.nextInt();
        scanner.nextLine();


        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("Idmaniniz Basliyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket turu(Burpee,Pushup,Situp,Squat) :  ");
            String hareketTuru = scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapacaksiniz  ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(hareketTuru, sayi);

        }

    }


}
