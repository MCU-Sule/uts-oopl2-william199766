package com.uts1.entity;
/**
 * @author william
 */
public class hutang {
    private int Id;
    private String PemberiHutang;
    private Double Jumlah;
    private player Player;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPemberiHutang() {
        return PemberiHutang;
    }

    public void setPemberiHutang(String pemberiHutang) {
        PemberiHutang = pemberiHutang;
    }

    public Double getJumlah() {
        return Jumlah;
    }

    public void setJumlah(Double jumlah) {
        Jumlah = jumlah;
    }

    public player getPlayer() {
        return Player;
    }

    public void setPlayer(player player) {
        Player = player;
    }
}
