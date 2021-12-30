package Inheretance;

public class Yonetici extends Calisan {//sub/altClass

    private int sorumlu_kisi;//extra ozellk

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
/*
   this.isim=isim;
    this.maas=maas;
    this.departman=departman;

 */
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public void zam_yap(int zam_miktari) {
        System.out.println("Calisanlara " + zam_miktari + " TL zam yapildi :)...");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
      /*  System.out.println("Isim : "+getIsim());
        System.out.println("Maas : "+getMaas());
        System.out.println("Departman : "+getDepartman());


       */
        super.bilgilerigoster();
        System.out.println("Sorumlu Kisi : "+this.sorumlu_kisi);




    }

    }












