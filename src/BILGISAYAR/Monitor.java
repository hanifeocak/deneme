package BILGISAYAR;

public class Monitor {

    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolition;

    public Monitor(String model, String uretici, String boyut, Resolution resolition) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolition = resolition;
    }
    public void monitoru_kapat(){
    System.out.println("monitor kapatiliyor...");
}
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolition() {
        return resolition;
    }

    public void setResolition(Resolution resolition) {
        this.resolition = resolition;
    }
}
