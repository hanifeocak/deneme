package IDMAN;

public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_saayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_saayisi;
    }


    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);

        } else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);


        } else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
            {

            }
        }else{
            System.out.println("gercersiz hareket turu..");

        }

    }

    public void burpeeYap(int sayi) {


            if (burpee_sayisi == 0){
                System.out.println("Yapacak burpeekalmadi");
            } else if (burpee_sayisi - sayi < 0) {
                System.out.println("tebrikler hedefi gectiniz");
                burpee_sayisi = 0;
                System.out.println("kalan burpee saysisi = " + burpee_sayisi);
            } else {
                burpee_sayisi -= sayi;
                System.out.println("Kalan burpee_sayisi :"+burpee_sayisi);

            }
    }

    public void squatYap(int sayi) {


        if (squat_sayisi == 0){
            System.out.println("Yapacak squat kalmadi");
        } else if (squat_sayisi- sayi < 0) {
            System.out.println("tebrikler hedefi gectiniz");
            squat_sayisi= 0;
            System.out.println("kalan sguat saysisi = " + squat_sayisi);
        } else {
           squat_sayisi -= sayi;
            System.out.println("Kalan squat_sayisi :"+squat_sayisi);

        }


    }

    public void situpYap(int sayi) {

        if (situp_sayisi == 0){
            System.out.println("Yapacak situp kalmadi");
        } else if (situp_sayisi- sayi < 0) {
            System.out.println("tebrikler hedefi gectiniz");
            situp_sayisi= 0;
            System.out.println("kalan situp saysisi = " + situp_sayisi);
        } else {
            situp_sayisi -= sayi;
            System.out.println("Kalan situp_sayisi :"+situp_sayisi);

        }

    }

    public void pushupYap(int sayi) {

        if (pushup_sayisi == 0) {
            System.out.println("Yapacak pushupkalmadi");
        } else if (pushup_sayisi - sayi < 0) {
            System.out.println("tebrikler hedefi gectiniz");
            pushup_sayisi = 0;
            System.out.println("kalan pushup saysisi = " + pushup_sayisi);
        } else {
            pushup_sayisi -= sayi;
            System.out.println("Kalan pushup_sayisi :"+pushup_sayisi);

        }
    }

    public boolean idmanBittiMi(){
        return(burpee_sayisi==0) && (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0);
    }

}