package Inheretance;

public class Calisan {//Super Class//Bize Class
    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis() {
        System.out.println("Calisan calsiyor....");


    }
    public void bilgilerigoster(){
        System.out.println("Isim : "+this.isim);
        System.out.println("Maas : "+this.maas);
        System.out.println("Departman : "+this.departman);
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("Departman degistiriliyor ...");
        this.departman=yeni_departman;
        System.out.println(" Yeni Departman  : "+this.departman);

    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }


}



