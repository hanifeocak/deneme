


public class C05 {
    public static void main(String[] args) {
       /* 5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
                Test Data:
        Yarım elmas uzunluğu : 7
        Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */

        for (int i = 0; i < 7; i++) {//satir
            for (int j = 0; j < 7-i; j++) {//bosluk
                System.out.print(" ");

            }
            for (int j = 0; j < 2*i+1; j++) {//yildiz
                System.out.print("*");

            }
         System.out.println();
        }
        for (int i =6; i >=0;i--) {
            for (int j =6-i; j >=0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}