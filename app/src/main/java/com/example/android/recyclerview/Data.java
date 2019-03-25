
package com.example.android.recyclerview;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("oid")
    @Expose
    private String oid;
    @SerializedName("hafta")
    @Expose
    private Integer hafta;
    @SerializedName("buyukIkramiyeKazananIl")
    @Expose
    private String buyukIkramiyeKazananIl;
    @SerializedName("cekilisTarihi")
    @Expose
    private String cekilisTarihi;
    @SerializedName("cekilisTuru")
    @Expose
    private String cekilisTuru;
    @SerializedName("rakamlar")
    @Expose
    private String rakamlar;
    @SerializedName("rakamlarNumaraSirasi")
    @Expose
    private String rakamlarNumaraSirasi;
    @SerializedName("devretti")
    @Expose
    private Boolean devretti;
    @SerializedName("devirSayisi")
    @Expose
    private Integer devirSayisi;
    @SerializedName("bilenKisiler")
    @Expose
    private List<BilenKisiler> bilenKisiler = null;
    @SerializedName("buyukIkrKazananIlIlceler")
    @Expose
    private List<Object> buyukIkrKazananIlIlceler = null;
    @SerializedName("kibrisHasilati")
    @Expose
    private Double kibrisHasilati;
    @SerializedName("devirTutari")
    @Expose
    private Double devirTutari;
    @SerializedName("kolonSayisi")
    @Expose
    private Integer kolonSayisi;
    @SerializedName("kdv")
    @Expose
    private Double kdv;
    @SerializedName("toplamHasilat")
    @Expose
    private Double toplamHasilat;
    @SerializedName("hasilat")
    @Expose
    private Double hasilat;
    @SerializedName("sov")
    @Expose
    private Double sov;
    @SerializedName("ikramiyeEH")
    @Expose
    private Double ikramiyeEH;
    @SerializedName("buyukIkramiye")
    @Expose
    private Double buyukIkramiye;
    @SerializedName("haftayaDevredenTutar")
    @Expose
    private Double haftayaDevredenTutar;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getHafta() {
        return hafta;
    }

    public void setHafta(Integer hafta) {
        this.hafta = hafta;
    }

    public String getBuyukIkramiyeKazananIl() {
        return buyukIkramiyeKazananIl;
    }

    public void setBuyukIkramiyeKazananIl(String buyukIkramiyeKazananIl) {
        this.buyukIkramiyeKazananIl = buyukIkramiyeKazananIl;
    }

    public String getCekilisTarihi() {
        return cekilisTarihi;
    }

    public void setCekilisTarihi(String cekilisTarihi) {
        this.cekilisTarihi = cekilisTarihi;
    }

    public String getCekilisTuru() {
        return cekilisTuru;
    }

    public void setCekilisTuru(String cekilisTuru) {
        this.cekilisTuru = cekilisTuru;
    }

    public String getRakamlar() {
        return rakamlar;
    }

    public void setRakamlar(String rakamlar) {
        this.rakamlar = rakamlar;
    }

    public String getRakamlarNumaraSirasi() {
        return rakamlarNumaraSirasi;
    }

    public void setRakamlarNumaraSirasi(String rakamlarNumaraSirasi) {
        this.rakamlarNumaraSirasi = rakamlarNumaraSirasi;
    }

    public Boolean getDevretti() {
        return devretti;
    }

    public void setDevretti(Boolean devretti) {
        this.devretti = devretti;
    }

    public Integer getDevirSayisi() {
        return devirSayisi;
    }

    public void setDevirSayisi(Integer devirSayisi) {
        this.devirSayisi = devirSayisi;
    }

    public List<BilenKisiler> getBilenKisiler() {
        return bilenKisiler;
    }

    public void setBilenKisiler(List<BilenKisiler> bilenKisiler) {
        this.bilenKisiler = bilenKisiler;
    }

    public List<Object> getBuyukIkrKazananIlIlceler() {
        return buyukIkrKazananIlIlceler;
    }

    public void setBuyukIkrKazananIlIlceler(List<Object> buyukIkrKazananIlIlceler) {
        this.buyukIkrKazananIlIlceler = buyukIkrKazananIlIlceler;
    }

    public Double getKibrisHasilati() {
        return kibrisHasilati;
    }

    public void setKibrisHasilati(Double kibrisHasilati) {
        this.kibrisHasilati = kibrisHasilati;
    }

    public Double getDevirTutari() {
        return devirTutari;
    }

    public void setDevirTutari(Double devirTutari) {
        this.devirTutari = devirTutari;
    }

    public Integer getKolonSayisi() {
        return kolonSayisi;
    }

    public void setKolonSayisi(Integer kolonSayisi) {
        this.kolonSayisi = kolonSayisi;
    }

    public Double getKdv() {
        return kdv;
    }

    public void setKdv(Double kdv) {
        this.kdv = kdv;
    }

    public Double getToplamHasilat() {
        return toplamHasilat;
    }

    public void setToplamHasilat(Double toplamHasilat) {
        this.toplamHasilat = toplamHasilat;
    }

    public Double getHasilat() {
        return hasilat;
    }

    public void setHasilat(Double hasilat) {
        this.hasilat = hasilat;
    }

    public Double getSov() {
        return sov;
    }

    public void setSov(Double sov) {
        this.sov = sov;
    }

    public Double getIkramiyeEH() {
        return ikramiyeEH;
    }

    public void setIkramiyeEH(Double ikramiyeEH) {
        this.ikramiyeEH = ikramiyeEH;
    }

    public Double getBuyukIkramiye() {
        return buyukIkramiye;
    }

    public void setBuyukIkramiye(Double buyukIkramiye) {
        this.buyukIkramiye = buyukIkramiye;
    }

    public Double getHaftayaDevredenTutar() {
        return haftayaDevredenTutar;
    }

    public void setHaftayaDevredenTutar(Double haftayaDevredenTutar) {
        this.haftayaDevredenTutar = haftayaDevredenTutar;
    }

}
