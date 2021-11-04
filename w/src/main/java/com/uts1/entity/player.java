package com.uts1.entity;
/**
 * @author william
 */
public class player {
    private int ID;
    private String Nama;
    private int Umur;
    private String Keahlian;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }

    public String getKeahlian() {
        return Keahlian;
    }

    public void setKeahlian(String keahlian) {
        Keahlian = keahlian;
    }
}
