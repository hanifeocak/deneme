import java.util.Scanner;

public class C01 {




    /*
            1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

            Test Data
            34
            Beklenen Çıktı
              7

         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
          int rakam;
        int rakamlarToplami=0;
        int sayi=scan.nextInt();


        while (sayi>0){

     rakam=sayi%10;
        rakamlarToplami+=rakam;
    sayi/=10;

    }
        System.out.println(rakamlarToplami);

        scan.close();
    }
}
