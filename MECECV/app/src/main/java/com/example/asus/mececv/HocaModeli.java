package com.example.asus.mececv;

/**
 * Created by asus on 15.6.2017.
 */

public class HocaModeli {

    private String isimId;
    private String LinkId;
    private int LogoId;

    public HocaModeli(String isimId, String linkId, int logoId) {
        this.isimId = isimId;
        LinkId = linkId;
        LogoId = logoId;
    }

    public String getIsimId() {
        return isimId;
    }

    public void setIsimId(String isimId) {
        this.isimId = isimId;
    }

    public String getLinkId() {
        return LinkId;
    }

    public void setLinkId(String linkId) {
        LinkId = linkId;
    }

    public int getLogoId() {
        return LogoId;
    }

    public void setLogoId(int logoId) {
        LogoId = logoId;
    }
}
