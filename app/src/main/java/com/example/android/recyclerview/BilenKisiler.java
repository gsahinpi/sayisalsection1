
package com.example.android.recyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BilenKisiler {

    @SerializedName("oid")
    @Expose
    private String oid;
    @SerializedName("kisiBasinaDusenIkramiye")
    @Expose
    private Double kisiBasinaDusenIkramiye;
    @SerializedName("kisiSayisi")
    @Expose
    private Integer kisiSayisi;
    @SerializedName("tur")
    @Expose
    private String tur;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Double getKisiBasinaDusenIkramiye() {
        return kisiBasinaDusenIkramiye;
    }

    public void setKisiBasinaDusenIkramiye(Double kisiBasinaDusenIkramiye) {
        this.kisiBasinaDusenIkramiye = kisiBasinaDusenIkramiye;
    }

    public Integer getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(Integer kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

}
