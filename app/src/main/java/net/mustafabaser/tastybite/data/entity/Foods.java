package net.mustafabaser.tastybite.data.entity;

import java.io.Serializable;

public class Foods implements Serializable {
    private int sepet_id;
    private String yemek_adi;
    private String yemek_resim_adi;
    private int yemek_fiyat;
    private int yemek_siparis_adet;
    private String kullanici_adi;

    public Foods() {
    }

    public Foods(int sepet_id, String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi) {
        this.sepet_id = sepet_id;
        this.yemek_adi = yemek_adi;
        this.yemek_resim_adi = yemek_resim_adi;
        this.yemek_fiyat = yemek_fiyat;
        this.yemek_siparis_adet = yemek_siparis_adet;
        this.kullanici_adi = kullanici_adi;
    }

    public int getSepet_id() {
        return sepet_id;
    }

    public void setSepet_id(int sepet_id) {
        this.sepet_id = sepet_id;
    }

    public String getYemek_adi() {
        return yemek_adi;
    }

    public void setYemek_adi(String yemek_adi) {
        this.yemek_adi = yemek_adi;
    }

    public String getYemek_resim_adi() {
        return yemek_resim_adi;
    }

    public void setYemek_resim_adi(String yemek_resim_adi) {
        this.yemek_resim_adi = yemek_resim_adi;
    }

    public int getYemek_fiyat() {
        return yemek_fiyat;
    }

    public void setYemek_fiyat(int yemek_fiyat) {
        this.yemek_fiyat = yemek_fiyat;
    }

    public int getYemek_siparis_adet() {
        return yemek_siparis_adet;
    }

    public void setYemek_siparis_adet(int yemek_siparis_adet) {
        this.yemek_siparis_adet = yemek_siparis_adet;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }
}
