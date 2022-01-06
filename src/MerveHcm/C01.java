package MerveHcm;

public class C01 {


    private String ad;
    private String soyAd;
    private int yas;
    private double diplomaNotu;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    private String cinsiyet;

    public C01(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "C01{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
