package DogalGaz;

public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgaz_kullanimi(int miktar) {
        if (this.bakiye - miktar < 0) {
            System.out.println("yterli bakiye yok..");
        } else {
            this.bakiye -= miktar;

            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmistir..:(En yakin kredi merkezine giderek kredi yukleyin " + "Kredi miktari = 120 TL");

            } else {
                System.out.println("Yeni bakiye = " + bakiye);

            }

        }
    }

    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }
}
