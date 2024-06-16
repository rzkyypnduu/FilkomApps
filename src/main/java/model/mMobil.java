package model;

public class mMobil {
    private String noPlat;
    private String merk;
    private String penyewa;

    public mMobil(String noPlat, String merk, String penyewa) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.penyewa = penyewa;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(String penyewa) {
        this.penyewa = penyewa;
    }
}

