package controller;

import model.mPegawai;
import java.util.ArrayList;
import java.util.List;

public class cPegawai {
    private List<mPegawai> listPegawai;

    public cPegawai() {
        listPegawai = new ArrayList<>();
    }

    public void tambahPegawai(mPegawai pegawai) {
        listPegawai.add(pegawai);
    }

    public List<mPegawai> getListPegawai() {
        return listPegawai;
    }

    public void hapusPegawai(int selectedRowIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hapusPegawai'");
    }

    public void editPegawai(int selectedRowIndex, mPegawai pegawai) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editPegawai'");
    }
}

