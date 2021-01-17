
package lıbrary_automatıon;
public class Kitaplar {
    private int id;
    private String kitap_ad;
    private String kitap_yazar ;
    private String kitap_turu;
    private int kitap_sayfa;
    private String  basim_yili;
    private String yayin_evi;
    private int adet;

    public Kitaplar(int id, String kitap_ad, String kitsp_yazar, String kitap_turu, int kitap_sayfa, String basim_yili, String yayin_evi, int adet) {
        this.id = id;
        this.kitap_ad = kitap_ad;
        this.kitap_yazar = kitsp_yazar;
        this.kitap_turu = kitap_turu;
        this.kitap_sayfa = kitap_sayfa;
        this.basim_yili = basim_yili;
        this.yayin_evi = yayin_evi;
        this.adet = adet;
    }

  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getKitap_ad() {
        return kitap_ad;
    }
    public void setKitap_ad(String kitap_ad) {
        this.kitap_ad = kitap_ad;
    }
    public String getKitap_yazar() {
        return kitap_yazar;
    }
    public void setKitap_yazar(String kitsp_yazar) {
        this.kitap_yazar = kitsp_yazar;
    }
    public String getKitap_turu() {
        return kitap_turu;
    }
    public void setKitap_turu(String kitap_turu) {
        this.kitap_turu = kitap_turu;
    }
    public int getKitap_sayfa() {
        return kitap_sayfa;
    }
    public void setKitap_sayfa(int kitap_sayfa) {
        this.kitap_sayfa = kitap_sayfa;
    }
    public String getBasim_yili() {
        return basim_yili;
    }
    public void setBasim_yili(String basim_yili) {
        this.basim_yili = basim_yili;
    }
    public String getYayin_evi() {
        return yayin_evi;
    }
    public void setYayin_evi(String yayin_evi) {
        this.yayin_evi = yayin_evi;
    }
    public int getAdet() {
        return adet;
    }
    public void setAdet(int adet) {
        this.adet = adet;
    }
    
}
