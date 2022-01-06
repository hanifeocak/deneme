package LAMBDDDA;

import Lambda.Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Lambda.Lambda01.*;


public class C01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        printElStructured(list);
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional(list);
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional1(list);//lambda expression
        System.out.println();
        System.out.println("   ***   ");
        printElCiftStructured(list);
        System.out.println();
        System.out.println("   ***   ");
        printElCiftfuncional2(list);
        System.out.println();
        System.out.println("   ***   ");
        printElCiftAltmistanKck(list);
        System.out.println();
        System.out.println("   ***   ");
        printTekElfunctional(list);
    
    
    
    }

    private static void printTekElfunctional(List<Integer> list) {
    }

    private static void printElCiftfuncional2(List<Integer> list) {
    }


    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.println(t + " "));
    }
    public static void printEl ( int t){System.out.println(t + " ");}

        public static void printElfuncional1(List < Integer > list) {
            list.stream().forEach(Lambda01::printEl);
        }
        //structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
        public static void printElCiftStructured(List<Integer> list) {
            for (Integer w : list) {
                if (w % 2 == 0) {
                    System.out.print(w + " ");
                }
            }
        }
    //Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz


    public static void printElCiftfuncional1(List<Integer> list) {
    list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);

}
    //Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printElCiftAltmistanKck(List<Integer> list) {
    list.stream().filter(t->t%2==0 && t<60).forEach(Lambda01::printEl);
    }
    //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void printTekElfunctional2(List<Integer> list) {
  
    
    }


}





