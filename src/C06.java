import java.util.Arrays;
import java.util.Scanner;

public class C06 {
    /*
    6----    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
               1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        Test Data:
        a
        Beklenen Çıktı:
        a harfi sesli harfdir.
        Test Data:
        d
        Beklenen Çıktı:
        d harfi sesiz harftir.
        Test Data:
        we yada %
        Beklenen Çıktı:
        Yanlis karakter girdiniz!
                ************************************************************************
                */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char arr[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        System.out.println("bir harf girin");
        String secim = scan.next();
        char harf = secim.charAt(0);
        if (secim.length() > 1) {
            System.out.println("birden fazla karakter girdiniz");

        }else{
            boolean son=false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=harf){

                }else{
                    son=true;

                }

            }if (son==true){
                System.out.println(secim+ " sesli harftir");
            }else{
                System.out.println(secim+" sessiz harftir");
            }
    }
}
}
