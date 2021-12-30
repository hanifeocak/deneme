package Inheretance;

public class Test {
    public static void main(String[] args) {


        //IS-A
        Yonetici yonetici1 = new Yonetici("Hanife Ocak", 30000, "IT",10);
        yonetici1.bilgilerigoster();
        yonetici1.zam_yap(500);
        yonetici1.bilgilerigoster();
    }
}
