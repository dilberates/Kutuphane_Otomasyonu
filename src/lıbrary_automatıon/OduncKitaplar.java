
package lıbrary_automatıon;

import java.util.Date;

public class OduncKitaplar {
    private int odunc_id;
   private String uye_ad;
   private String uye_soyad;
   private String kitap_adi;
   private java.util.Date ver_tarihi;
   private java.util.Date teslm_tarihi;

    public OduncKitaplar(int odunc_id,String uye_ad, String uye_soyad, String kitap_adi, Date ver_tarihi, Date teslm_tarihi) {
        this.odunc_id=odunc_id;
        this.uye_ad = uye_ad;
        this.uye_soyad = uye_soyad;
        this.kitap_adi = kitap_adi;
        this.ver_tarihi = ver_tarihi;
        this.teslm_tarihi = teslm_tarihi;
    }

    public String getUye_ad() {
        return uye_ad;
    }

    public void setUye_ad(String uye_ad) {
        this.uye_ad = uye_ad;
    }

    public String getUye_soyad() {
        return uye_soyad;
    }

    public void setUye_soyad(String uye_soyad) {
        this.uye_soyad = uye_soyad;
    }

    public String getKitap_adi() {
        return kitap_adi;
    }

    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    public java.util.Date getVer_tarihi() {
        return ver_tarihi;
    }

    public void setVer_tarihi(java.util.Date ver_tarihi) {
        this.ver_tarihi = ver_tarihi;
    }

    public java.util.Date getTeslm_tarihi() {
        return teslm_tarihi;
    }

    public void setTeslm_tarihi(java.util.Date teslm_tarihi) {
        this.teslm_tarihi = teslm_tarihi;
    }

    public int getOdunc_id() {
        return odunc_id;
    }

    public void setOdunc_id(int odunc_id) {
        this.odunc_id = odunc_id;
    }

}
