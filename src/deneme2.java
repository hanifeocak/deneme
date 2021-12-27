
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class deneme2 {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();

 /*
  kullanıcııdan alınan listedeki elemanların
  1.tüm elemanların toplamını yazdıralım
  2.karelerini aldıralım
  3. tek eleman varsa küpünü alıp 3 fazlasının listesini yazdıralım
  4.cift elemanların kareköklerini ve aynı eleman tekrar etmiyecek şekilde kücükden büyüge yazdıralım
  5. tek olan eleamnları kücükden büyüge tekrarsız yazdıralım

   */


    public static void main(String[] args) {
        System.out.println("Listemizdeki elemanlari aralarinda bosluk birarkarak yazalim");
        String listeEl = scanner.nextLine();
        String[] liste = listeEl.split(" ");
        for (String w : liste) {
            list.add(Integer.valueOf(w));
        }
        System.out.println(list);
        menu();
    }
public static boolean ciftEl(int x){

    return ( x % 2 ==0);
}
 public static boolean tekEl(int x) {


     return (x % 2 !=0);
 }
private static void menu() {
    System.out.println("Seciminiz yapiniz :  \n1.Tum elemanlari toplayiniz\n2.Karelerini al\n3.tek elemanlarin kupunu alma \n4.cift elemanlarin karekokunu alma\n5.Tek olanlari sirala");
int secim= scanner.nextInt();
switch (secim){
    case 1:
    // list.stream().reduce(Integer::sum);
      Optional<Integer> toplam =list.stream().reduce (Math::addExact);
        System.out.println(list+"listedeki elemanlarin toplami :"+toplam);
        System.out.println("devam etmek icin bir tusa basiniz");
         scanner.nextLine();
        menu();
        break;
    case 2:
     list.stream().filter(deneme2::ciftEl).map(t-> t*t).forEach(t-> System.out.println(t+" "));
        System.out.println("devam etmek icin bir tusa basiniz");
        scanner.nextLine();
        menu();
        break;
    case 3:
        list.stream().filter(deneme2::tekEl).map(t-> t*t*t).forEach(t-> System.out.println(t+" "));
        System.out.println("devam etmek icin bir tusa basiniz");
        scanner.nextLine();
        menu();
        break;
    case 4:
        list.stream().filter(deneme2 ::ciftEl).map(t->t*t*t).forEach(t-> System.out.println(t+" "));
         System.out.println("devam etmek icin bir tusa basiniz");
        scanner.nextLine();
        menu();
        break;
    case 5:
    list.stream().filter(deneme2::tekEl).sorted().forEach(t-> System.out.println(t+" "));
        System.out.println("devam etmek icin bir tusa basiniz");
        scanner.nextLine();
        menu();
        break;

    }

    }
    }



