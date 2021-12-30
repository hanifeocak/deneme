package ProjemATM;

public class Main {
    public static void main(String[] args) {
        Atm atm=new Atm();
        Hesap hesap=new Hesap("Hanife Ocak","12345",2000);

        atm.calis(hesap);
        System.out.println("Program calisiyor..");

    }

}
