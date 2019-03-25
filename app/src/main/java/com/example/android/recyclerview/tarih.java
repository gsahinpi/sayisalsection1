package com.example.android.recyclerview;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class tarih implements Serializable {

    @SerializedName("tarih")
    @Expose
    private String tarih;
    @SerializedName("tarihView")
    @Expose
    private String tarihView;

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTarihView() {
        return tarihView;
    }

    public void setTarihView(String tarihView) {
        this.tarihView = tarihView;
    }

}