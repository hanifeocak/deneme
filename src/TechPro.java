public class TechPro {

    private String batch;
    private String batchName;
    private  int batchOrt;
    private int ogrSayisi;

    public TechPro(String batch, String batchName, int batchOrt, int ogrSayisi) {
        this.batch = batch;
        this.batchName = batchName;
        this.batchOrt = batchOrt;
        this.ogrSayisi = ogrSayisi;
    }

    public TechPro() {
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchOrt() {
        return batchOrt;
    }

    public void setBatchOrt(int batchOrt) {
        this.batchOrt = batchOrt;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrSayisi = ogrcSayisi;
    }

    @Override
    public String toString() {
        return "TechPro{" +
                "batch='" + batch + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchOrt=" + batchOrt +
                ", ogrSayisi=" + ogrSayisi +
                '}';

    }
}