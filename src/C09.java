import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 3, 45, 66, 7, 9, 89, 12));
        printElStructured(list);//method call
        System.out.println();
        System.out.println("  ***   ");
        printElfunctional(list);
        System.out.println();
        System.out.println("  ***   ");
        printElfunctional1(list);
        System.out.println();
        System.out.println("  ***   ");
        printElStructured(list);
        System.out.println();
        System.out.println("  ***   ");
        printCiftElfunctional1(list);
        System.out.println();
        System.out.println("  ***   ");
       // onbestenBykKckTekSayi(list);
        System.out.println();
        System.out.println("  ***   ");
       // ciftKareKckByk(list);


    }


    //structured programing ile list elemanlarinin tamamini yazdiriniz
//aralarinda bosluk olarak
    public static void printElStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // //Functional programing ile list elemanlarinin tamamini aralarinda bosluk olarak yazdi
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//Lambda operatoru
        //stream() :datalarin yu. as. semasiii
        //forEach() :datanin parametreisne gore her bir elemani isler/gezer
        //t-> lambda operatoru
        //Lambda expression yapisi cok tavsiye edilmez


    }

    //Maehod Referance : kendimiz create ettigimiz yada javadan aldigimiz method ile
    //ClassName :MethodName
    public static void printEl(int t) {//refere edilecek method creat edildi
        System.out.print(t + " ");

    }

    public static void printElfunctional1(List<Integer> list) {
        list.stream().forEach(C09::printEl);//iste lambda budurrr

    }

    public static void printCiftElStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//12, 3, 45, 66, 7, 9, 89, 12
            }
        }
    }

    public static void printCiftElfunctional1(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(C09::printEl);


//Listteki 15'ten buyuk en kucuk tek sayiyi yazdiriniz
      //  public static void onbestenBykKckTekSayi (List < Integer > list) {

            // list.stream().filter(t->t%2==1).filter(t-> t>15).reduce(Integer:: min);
            System.out.println(list.
                    stream().//akisa girdi
                            filter(t -> t % 2 == 1 & t > 15).//tek ve 15den buyuk
                            reduce(Integer::min));//min degeri reduce edildi

//list'in cift elemanlarinin karelerini buyukten kucuge yazdirin
        }
      //  public static void ciftKareKckByk (List < Integer > list) {
          //  list.stream().filter(C10::ciftBul).map(t -> t);


        }





