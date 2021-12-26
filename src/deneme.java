import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

            // Kullan�c�dan alaca��n� bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir String giriniz");
            String str=scan.nextLine();
            boolean varMi=str.contains(" ");
            System.out.println("stringde bo�luk karakteri varMi:" + varMi );

            System.out.println("girilen string bos mu ?:"+str.isEmpty());
    }
}
