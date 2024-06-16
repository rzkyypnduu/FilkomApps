package controller;

import java.util.ArrayList;
import java.util.List;
import model.mMobil;

public class cMobil {
    private List<mMobil> listMobil;

    public cMobil() {
        listMobil = new ArrayList<>();
    }

    public void tambahMobil(String noPlat, String merk, String penyewa) {
        mMobil mobil = new mMobil(noPlat, merk, penyewa);
        listMobil.add(mobil);
    }

    public List<mMobil> getListMobil() {
        return listMobil;
    }

    public void editMobil(int index, String noPlat, String merk, String penyewa) {
        if (index >= 0 && index < listMobil.size()) {
            mMobil mobil = listMobil.get(index);
            mobil.setNoPlat(noPlat);
            mobil.setMerk(merk);
            mobil.setPenyewa(penyewa);
        }
    }

    public void hapusMobil(int index) {
        if (index >= 0 && index < listMobil.size()) {
            listMobil.remove(index);
        }
    }
}
