package BeybladeOyunu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Bayblade Programina Hosgeldiniz.....");
        System.out.println("Cikis icin q'ya basin...");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi Bayblade turu uretmek istiyorsunuz");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor..");
                break;
            } else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("Lutfen geverli bir bayblade ismi giriniz..");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }

    }
}






